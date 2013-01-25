

	lfp
	push 5
	jal sommatoria
	print

	lfp
	push 5
	jal fibonacci
	print

	push -1
	push 0
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
	push 1
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
	push 0
	sw

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
	push 1
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
	push 1
	sw

	push -1
	push 0
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
	push 1
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
	push 0
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
	push 2
	sw

	push -1
	push 0
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
	push 3
	sw


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

	lfp
	push -1
	jal sommatutti
	print


	lfp
	push 10
	push 5
	jal mult
	print


	lfp
	push 5
	jal fattoriale
	print

	halt
sommatoria:
	lsp
	sfp
	lra
	push 0
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
	lfp
	push 1
	lfp
	push 0
	add
	lw
	sub
	jal sommatoria
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
fibonacci:
	lsp
	sfp
	lra
	push 0
	lfp
	push 0
	add
	lw
	beq label4
	push 0
	b label5
label4:
	push 1
label5:
	push 1
	beq label10
	push 1
	lfp
	push 0
	add
	lw
	beq label6
	push 0
	b label7
label6:
	push 1
label7:
	push 1
	beq label8
	lfp
	push 1
	lfp
	push 0
	add
	lw
	sub
	jal fibonacci
	lfp
	push 2
	lfp
	push 0
	add
	lw
	sub
	jal fibonacci
	add
	b label9
label8:
	push 1
label9:
	b label11
label10:
	push 1
label11:
	srv
	sra
	pop
	sfp
	lrv
	jra
sommatutti:
	lsp
	sfp
	lra
	push -1
	lfp
	push 0
	add
	lw
	beq label12
	push 0
	b label13
label12:
	push 1
label13:
	push 1
	beq label14
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
	b label15
label14:
	push 0
label15:
	srv
	sra
	pop
	sfp
	lrv
	jra
mult:
	lsp
	sfp
	lra
	push 1
	lfp
	push 1
	add
	lw
	beq label16
	push 0
	b label17
label16:
	push 1
label17:
	push 1
	beq label18
	lfp
	push 0
	add
	lw
	lfp
	push 1
	lfp
	push 1
	add
	lw
	sub
	lfp
	push 0
	add
	lw
	jal mult
	add
	b label19
label18:
	lfp
	push 0
	add
	lw
label19:
	srv
	sra
	pop
	pop
	sfp
	lrv
	jra
fattoriale:
	lsp
	sfp
	lra
	push 0
	lfp
	push 0
	add
	lw
	beq label20
	push 0
	b label21
label20:
	push 1
label21:
	push 1
	beq label22
	lfp
	lfp
	push 1
	lfp
	push 0
	add
	lw
	sub
	jal fattoriale
	lfp
	push 0
	add
	lw
	jal mult
	b label23
label22:
	push 1
label23:
	srv
	sra
	pop
	sfp
	lrv
	jra
