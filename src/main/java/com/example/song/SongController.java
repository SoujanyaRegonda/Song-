package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.song.SongService;

@RestController
public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs() {

        return songService.getAllSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongId(@PathVariable("songId") int songId) {
        return songService.getSongById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song update(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId) {
        songService.deleteSong(songId);
    }

}