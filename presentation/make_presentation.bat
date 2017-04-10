@echo off
@setlocal

set OUTPUT_DIR=build
set PRESENTATION_MAIN=main_presentation.tex
set SPEECH_MAIN=main_speech.tex

set LATEX_MAKE=latexmk

set PRESENTATION_OUTPUT=jield-presentation
set SPEECH_OUTPUT=jield-speech

rmdir /q /s %OUTPUT_DIR%

mkdir %OUTPUT_DIR%

%LATEX_MAKE% -f -pdf -jobname=%OUTPUT_DIR%/%PRESENTATION_OUTPUT%  %PRESENTATION_MAIN%

%LATEX_MAKE% -c -f -jobname=%OUTPUT_DIR%/%PRESENTATION_OUTPUT%  %PRESENTATION_MAIN%


%LATEX_MAKE% -f -pdf -jobname=%OUTPUT_DIR%/%SPEECH_OUTPUT%  %SPEECH_MAIN%

%LATEX_MAKE% -c -f -jobname=%OUTPUT_DIR%/%SPEECH_OUTPUT%  %SPEECH_MAIN%
