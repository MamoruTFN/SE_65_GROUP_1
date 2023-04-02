// ======หน้าเขียนบอร์ดใหม่=========
import React from 'react'
import { useState, useEffect } from "react";
import "./WritePage.css"
import TextField from '@material-ui/core/TextField';
import OutlinedInput from '@material-ui/core/OutlinedInput';
import InputLabel from '@material-ui/core/InputLabel';
import MenuItem from '@material-ui/core/MenuItem';
import FormControl from '@material-ui/core/FormControl';
import Select from '@material-ui/core/Select';
import { useTheme } from '@material-ui/core/styles';
import Chip from '@material-ui/core/Chip';
import Box from '@material-ui/core/Box';
import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';
// import PhotoCamera from '@material-ui/core/PhotoCamera';


const ITEM_HEIGHT = 48;
const ITEM_PADDING_TOP = 8;
const MenuProps = {
  PaperProps: {
    style: {
      maxHeight: ITEM_HEIGHT * 4.5 + ITEM_PADDING_TOP,
      width: 250,
    },
  },
};

const names = [
  'กีฬา',
  'เศรฐกิจ',
  'คอมพิวเตอร์',
  'ศิลปะ',
  'ความงาม',
  'กีฬา',
  'อสังหาทรัพย์',
];

function getStyles(name, personName, theme) {
  return {
    fontWeight:
      personName.indexOf(name) === -1
        ? theme.typography.fontWeightRegular
        : theme.typography.fontWeightMedium,
  };
}

export default function WritePage() {
  const theme = useTheme();
  const [personName, setPersonName] = React.useState([]);
  const [images, setImages] = useState([]);
  const [imageURLs, setImageURLs] = useState([]);

  const handleChange = (event) => {
    const {
      target: { value },
    } = event;
    setPersonName(
      // On autofill we get a stringified value.
      typeof value === 'string' ? value.split(',') : value,
    );
  };

  useEffect(() => {
    if (images.length < 1) return;
    const newImageUrls = [];
    images.forEach((image) => newImageUrls.push(URL.createObjectURL(image)));
    setImageURLs(newImageUrls);
  }, [images]);

  function onImageChange(e) {
    setImages([...e.target.files]);
  }

  console.log("Images : ", images);
  console.log("imageURLs : ", imageURLs);

  return (
    <div>

      <div className='write-page'>

        <div className='write-con'>

          <div className='write-tag'>

            <FormControl sx={{ m: 1, width: 300 }}>

              <InputLabel id="demo-multiple-chip-label">Tag</InputLabel>

              <Select
                labelId="demo-multiple-chip-label"
                id="demo-multiple-chip"
                multiple
                value={personName}
                onChange={handleChange}
                input={<OutlinedInput id="select-multiple-chip" label="Chip" />}
                renderValue={(selected) => (
                  <Box sx={{ display: 'flex', flexWrap: 'wrap', gap: 0.5 }}>
                    {selected.map((value) => (
                      <Chip key={value} label={value} />
                    ))}
                  </Box>
                )}
                MenuProps={MenuProps}
              >
                {names.map((name) => (
                  <MenuItem
                    key={name}
                    value={name}
                    style={getStyles(name, personName, theme)}
                  >
                    {name}
                  </MenuItem>
                ))}
              </Select>
            </FormControl>

          </div>
          <div className='write-up-img'>

            <div className='a'>Cover image</div>

            <Button
              variant="contained"
              component="label"
              color='tertiary'
              size="small"
            >
              Upload
              <input hidden accept="image/*" type="file" onChange={onImageChange} />
              {/* <input hidden accept="image/*" multiple type="file" /> */}
            </Button>


          </div>
          <div className="pic">{imageURLs.map((imageSrc, idx) => (
            <img key={idx} width="320" height="200" src={imageSrc} />
          ))}
          </div>

          <div className='write-topic'>

            <div className='a'>Title</div>

            <TextField
              id="filled-basic"
              label="Title"
              variant="filled"
            />

          </div>

          <div className='write-content'>

            <div className='a'>Paragrap</div>

            <TextField
              id="filled-textarea"
              placeholder="Type your content"
              multiline
              variant="filled"

            />
            <div className='post-button'>
              <Button
                variant="contained"
                color='primary'
                size="large"
              >
                Post
              </Button>


            </div>
          </div>



        </div>

      </div>
    </div>

  );
}






