package eng.cpe.se.project.api.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import eng.cpe.se.project.api.util.Response;
import eng.cpe.se.project.model.Comment;
import eng.cpe.se.project.model.Post;
import eng.cpe.se.project.model.Report;
import eng.cpe.se.project.model.User;
import eng.cpe.se.project.service.CommentService;
import eng.cpe.se.project.service.PostService;
import eng.cpe.se.project.service.ReportService;
import eng.cpe.se.project.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/posts")
public class PostRestController {
	
	@Autowired
	private PostService postService;
	@Autowired
	private ReportService reportService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private UserService userService;
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Response<ObjectNode>> handleValidationExceptions(MethodArgumentNotValidException ex){
        Response<ObjectNode> res = new Response<>();
        res.setHttpStatus(HttpStatus.BAD_REQUEST);

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode responObject = mapper.createObjectNode();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldname = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            responObject.put(fieldname, errorMessage);
        });
        res.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        res.setBody(responObject);
        return new ResponseEntity<Response<ObjectNode>>(res,res.getHttpStatus());
    }
	
	@GetMapping("/page/{page}/value/{value}")
	public ResponseEntity<Response<List<Post>>> findAll(@PathVariable("page")int page,@PathVariable("value")int value) {
		Response<List<Post>> res = new Response<>();
		try {
			List<Post> posts = postService.findAll(page, value);
			res.setMessage("find success");
			res.setBody(posts);
			res.setHttpStatus(HttpStatus.OK);
			return new ResponseEntity<Response<List<Post>>>(res, res.getHttpStatus());
		} catch (Exception ex) {
			res.setBody(null);
			res.setHttpStatus(HttpStatus.NOT_FOUND);
			return new ResponseEntity<Response<List<Post>>>(res, res.getHttpStatus());
		}
	}
	
	@PutMapping("/{id}")
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize("hasRole('User') or hasRole('Staff') or hasRole('SystemAdmin')")
	public ResponseEntity<Response<Post>> updateById(@PathVariable("id")int id,@RequestBody Post post){
		Response<Post> res = new Response<>();
		Post p = postService.findById(id);
		try {
			p.clone(post);
			postService.save(p);
			res.setMessage("update "+id+"success");
			res.setBody(p);
			res.setHttpStatus(HttpStatus.OK);
			return new ResponseEntity<Response<Post>>(res, res.getHttpStatus());
		} catch (Exception ex) {
			res.setBody(null);
			res.setHttpStatus(HttpStatus.NOT_FOUND);
			return new ResponseEntity<Response<Post>>(res, res.getHttpStatus());
		}
	}
	
	@DeleteMapping("/{id}")
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize("hasRole('USER') or hasRole('Staff') or hasRole('SystemAdmin')")
	public ResponseEntity<Response<String>> deleteById(@PathVariable("id")int id){
		Response<String> res = new Response<String>();
		try {
			postService.delete(id);
			res.setMessage("delete"+ id + "success");
			res.setBody("");
			res.setHttpStatus(HttpStatus.OK);
			return new ResponseEntity<Response<String>>(res, res.getHttpStatus());
		} catch (Exception ex) {
			res.setBody(null);
			res.setHttpStatus(HttpStatus.NOT_FOUND);
			return new ResponseEntity<Response<String>>(res, res.getHttpStatus());
		}
	}
	
	@PostMapping("/{postid}/report")
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize("hasRole('User')")
	public ResponseEntity<Response<Report>> createReportByPost(@PathVariable("postid")int postid, @Valid@RequestBody Report report){
		Response<Report> res = new Response<Report>();
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		Post post = postService.findById(postid);
		User user = userService.findByEmail(email);
		try {
			report.setUser(user);
			report.setPost(post);
			reportService.save(report);
			res.setMessage("create report Success");
			res.setBody(report);
			res.setHttpStatus(HttpStatus.OK);
			return new ResponseEntity<Response<Report>>(res, res.getHttpStatus());
		}catch (Exception ex) {
			res.setBody(null);
			res.setHttpStatus(HttpStatus.NOT_FOUND);
			return new ResponseEntity<Response<Report>>(res, res.getHttpStatus());
		}
	}
	
	@PostMapping("/{id}/comment")
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize("hasRole('User')")
	public ResponseEntity<Response<Comment>> createCommentByPost(@PathVariable("id")int id, @Valid@RequestBody Comment comment){
		Response<Comment> res = new Response<Comment>();
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		Post post = postService.findById(id);
		User user = userService.findByEmail(email);
		try {
			comment.setPost(post);
			comment.setUser(user);
			commentService.save(comment);
			res.setMessage("create report Success");
			res.setBody(comment);
			res.setHttpStatus(HttpStatus.OK);
			return new ResponseEntity<Response<Comment>>(res, res.getHttpStatus());
		}catch (Exception ex) {
			res.setBody(null);
			res.setHttpStatus(HttpStatus.NOT_FOUND);
			return new ResponseEntity<Response<Comment>>(res, res.getHttpStatus());
		}
	}

}
