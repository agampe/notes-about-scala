# $Id: Makefile 2009 Helex

pdfold: 
	latex scala
	dvips scala
	ps2pdf -dAutoFilterColorImages=false -sColorImageFilter=FlateEncode scala.ps

bib:
	latex scala
	# bibtex bu1
	latex scala
	pdflatex scala.tex

pdf:
	pdflatex scala.tex

mvin:
	for TEX in *.png ; do mv $$TEX Bilder; done
	for TEX in *.pdf; do mv $$TEX Skript; done
	for TEX in *.tex; do mv $$TEX Tex; done
	for TEX in *.fig ; do mv $$TEX Bilder; done
	for TEX in *.bib; do mv $$TEX Tex; done

mvbk:
	for TEX in Tex/*.tex; do mv $$TEX $${TEX##*/}; done
	for TEX in Bilder/*.fig ; do mv $$TEX $${TEX##*/}; done
	for TEX in Skript/*.pdf ; do mv $$TEX $${TEX##*/}; done
	for TEX in Bilder/*.png ; do mv $$TEX $${TEX##*/}; done
	for TEX in Tex/*.bib; do mv $$TEX $${TEX##*/}; done
	for TEX in Bilder/*.pstex ; do mv $$TEX $${TEX##*/}; done
	
conv:
	for IMG in *.png; do inkscape --export-eps=$${IMG%%.png}.eps $$IMG; done
	
fig:	
	for FIG in *.fig; do fig2dev -L pstex $$FIG $${FIG%.*}.pstex; done 
	for FIG in *.fig; do fig2dev -L pstex_t -p $${FIG%.*}.pstex $$FIG $${FIG%.*}.pstex_t $$FIG; done
	
figpdf:	
	for FIG in *.fig; do fig2dev -L pdftex $$FIG $${FIG%.*}.pdftex; done
	for FIG in *.fig; do fig2dev -L pstex_t -p $${FIG%.*}.pdftex $$FIG $${FIG%.*}.pdftex_t; done

clean:
	rm -f *.ps *.log *.aux *.dvi *.toc *.idx \
        *.blg *.bak *.ilg *.ind *.out *.lof *.eps *.pstex_t *.pdftex_t *pstex *pdftex *.loa \
        *.bbl
