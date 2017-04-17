@echo off
@setlocal

set OUTPUT_DIR=build
set PRESENTATION_MAIN=main_presentation.tex
set TALK_MAIN=main_talk.tex

set LATEX_MAKE=latexmk

set PRESENTATION_OUTPUT=jield-presentation
set TALK_OUTPUT=jield-talk

rmdir /q /s %OUTPUT_DIR%

mkdir %OUTPUT_DIR%

%LATEX_MAKE% -f -pdf -jobname=%OUTPUT_DIR%/%PRESENTATION_OUTPUT%  %PRESENTATION_MAIN%

%LATEX_MAKE% -c -f -jobname=%OUTPUT_DIR%/%PRESENTATION_OUTPUT%  %PRESENTATION_MAIN%


%LATEX_MAKE% -f -pdf -jobname=%OUTPUT_DIR%/%TALK_OUTPUT%  %TALK_MAIN%

%LATEX_MAKE% -c -f -jobname=%OUTPUT_DIR%/%TALK_OUTPUT%  %TALK_MAIN%
