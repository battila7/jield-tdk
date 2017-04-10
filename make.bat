@echo off

chdir paper

call make_paper.bat all

chdir ../presentation

call make_presentation.bat

chdir ..
