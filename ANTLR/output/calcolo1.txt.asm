
	lfp
	push -1
	push 3
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 5
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	jal sommatutti
	print

	halt
sommatutti:
	lsp
	sfp
	lra
	push -1
	lfp
	push 0
	add
	lw
	beq label0
	push 0
	b label1
label0:
	push 1
label1:
	push 1
	beq label2
	lfp
	push 0
	add
	lw
	lw
	lfp
	lfp
	push 0
	add
	lw
	push 1	add
	lw
	jal sommatutti
	add
	b label3
label2:
	push 0
label3:
	srv
	sra
	pop
	sfp
	lrv
	jra
