package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fi4 {

    /* JADX INFO: renamed from: a */
    public static final d31 f19017a = new d31(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m5717a(p000.uf4 r5, boolean r6, p000.fc3 r7, p000.AbstractC0888lx r8) {
        /*
            boolean r0 = r8 instanceof p000.wh4
            if (r0 == 0) goto L13
            r0 = r8
            wh4 r0 = (p000.wh4) r0
            int r1 = r0.f33397x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33397x = r1
            goto L18
        L13:
            wh4 r0 = new wh4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f33396w
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f33397x
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.f33395v
            fc3 r6 = r0.f33394u
            uf4 r7 = r0.f33393t
            p000.k43.m7376J(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r5)
            r5 = 0
            return r5
        L38:
            p000.k43.m7376J(r8)
        L3b:
            r0.f33393t = r5
            r0.f33394u = r7
            r0.f33395v = r6
            r0.f33397x = r3
            java.lang.Object r8 = r5.m11538a(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            ec3 r8 = (p000.ec3) r8
            boolean r2 = m5721e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.f18000a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi4.m5717a(uf4, boolean, fc3, lx):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m5718b(uf4 uf4Var, AbstractC0888lx abstractC0888lx, int i) {
        fc3 fc3Var = fc3.f18903a;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            fc3Var = fc3.f18904b;
        }
        return m5717a(uf4Var, z, fc3Var, abstractC0888lx);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[LOOP:0: B:19:0x004d->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[LOOP:1: B:22:0x0064->B:26:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0066
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m5719c(p000.uf4 r8, p000.ym0 r9) {
        /*
            boolean r0 = r9 instanceof p000.xh4
            if (r0 == 0) goto L13
            r0 = r9
            xh4 r0 = (p000.xh4) r0
            int r1 = r0.f34284v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34284v = r1
            goto L18
        L13:
            xh4 r0 = new xh4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34283u
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f34284v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uf4 r8 = r0.f34282t
            p000.k43.m7376J(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r8)
            r8 = 0
            return r8
        L30:
            p000.k43.m7376J(r9)
        L33:
            r0.f34282t = r8
            r0.f34284v = r3
            fc3 r9 = p000.fc3.f18904b
            java.lang.Object r9 = r8.m11538a(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            ec3 r9 = (p000.ec3) r9
            java.util.List r2 = r9.f18000a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L4d:
            if (r6 >= r4) goto L5b
            java.lang.Object r7 = r2.get(r6)
            lc3 r7 = (p000.lc3) r7
            r7.m7952a()
            int r6 = r6 + 1
            goto L4d
        L5b:
            java.util.List r9 = r9.f18000a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L64:
            if (r5 >= r2) goto L74
            java.lang.Object r4 = r9.get(r5)
            lc3 r4 = (p000.lc3) r4
            boolean r4 = r4.f23938d
            if (r4 == 0) goto L71
            goto L33
        L71:
            int r5 = r5 + 1
            goto L64
        L74:
            ju4 r8 = p000.ju4.f22634a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi4.m5719c(uf4, ym0):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static Object m5720d(pc3 pc3Var, h84 h84Var, yp1 yp1Var, wm0 wm0Var, int i) {
        nq1 nq1Var = h84Var;
        if ((i & 4) != 0) {
            nq1Var = f19017a;
        }
        Object objM13685q = zp0.m13685q(new C1031pe(pc3Var, nq1Var, yp1Var, (wm0) null), wm0Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m5721e(ec3 ec3Var, boolean z) {
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lc3 lc3Var = (lc3) list.get(i);
            if (!(z ? AbstractC1356y5.m12920n(lc3Var) : AbstractC1356y5.m12921o(lc3Var))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static t82 m5722f(zo0 zo0Var, t82 t82Var, mq1 mq1Var) {
        return lb5.m7910S(zo0Var, null, cp0.f16328d, new C1199ty((Object) t82Var, (Object) mq1Var, (wm0) null, (byte) 9), 1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03af  */
    /* JADX WARN: Code duplicated, block: B:103:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x03da  */
    /* JADX WARN: Code duplicated, block: B:110:0x03df  */
    /* JADX WARN: Code duplicated, block: B:26:0x0188  */
    /* JADX WARN: Code duplicated, block: B:27:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0212  */
    /* JADX WARN: Code duplicated, block: B:44:0x0238  */
    /* JADX WARN: Code duplicated, block: B:47:0x0244  */
    /* JADX WARN: Code duplicated, block: B:49:0x0248  */
    /* JADX WARN: Code duplicated, block: B:50:0x024d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0251  */
    /* JADX WARN: Code duplicated, block: B:55:0x025b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0266  */
    /* JADX WARN: Code duplicated, block: B:58:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0277 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0279  */
    /* JADX WARN: Code duplicated, block: B:62:0x0283  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x02c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0300  */
    /* JADX WARN: Code duplicated, block: B:79:0x0322  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x032b  */
    /* JADX WARN: Code duplicated, block: B:84:0x034c  */
    /* JADX WARN: Code duplicated, block: B:87:0x035f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0385  */
    /* JADX WARN: Code duplicated, block: B:93:0x0392  */
    /* JADX WARN: Code duplicated, block: B:95:0x0396  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x03a6  */
    /* JADX INFO: renamed from: g */
    public static final Object m5723g(uf4 uf4Var, zo0 zo0Var, df3 df3Var, nq1 nq1Var, yp1 yp1Var, AbstractC0888lx abstractC0888lx) {
        bi4 bi4Var;
        zo0 zo0Var2;
        df3 df3Var2;
        nq1 nq1Var2;
        yp1 yp1Var2;
        Object objM5718b;
        yp1 yp1Var3;
        yp1 yp1Var4;
        lc3 lc3Var;
        t82 t82VarM7910S;
        df3 df3Var3;
        lc3 lc3Var2;
        Object objM5724h;
        uf4 uf4Var2;
        t82 t82Var;
        zo0 zo0Var3;
        nq1 nq1Var3;
        yp1 yp1Var5;
        Object objM5725i;
        uf4 uf4Var3;
        zo0 zo0Var4;
        yp1 yp1Var6;
        yp1 yp1Var7;
        yp1 yp1Var8;
        lc3 lc3Var3;
        df3 df3Var4;
        t82 t82VarM5722f;
        yp1 yp1Var9;
        nq1 nq1Var4;
        Object objM11542n;
        lc3 lc3Var4;
        yp1 yp1Var10;
        nq1 nq1Var5;
        yp1 yp1Var11;
        yp1 yp1Var12;
        zo0 zo0Var5;
        io2 io2Var;
        df3 df3Var5;
        zo0 zo0Var6;
        lc3 lc3Var5;
        t82 t82VarM7910S2;
        df3 df3Var6;
        Object objM5724h2;
        t82 t82Var2;
        lc3 lc3Var6;
        df3 df3Var7;
        yp1 yp1Var13;
        uf4 uf4Var4;
        yp1 yp1Var14;
        zo0 zo0Var7;
        lc3 lc3Var7;
        io2 io2Var2;
        zo0 zo0Var8;
        t82 t82Var3;
        df3 df3Var8;
        uf4 uf4Var5 = uf4Var;
        if (abstractC0888lx instanceof bi4) {
            bi4Var = (bi4) abstractC0888lx;
            int i = bi4Var.f15316D;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi4Var.f15316D = i - Integer.MIN_VALUE;
            } else {
                bi4Var = new bi4(abstractC0888lx);
            }
        } else {
            bi4Var = new bi4(abstractC0888lx);
        }
        Object objM5725i2 = bi4Var.f15315C;
        ap0 ap0Var = ap0.f14763a;
        int i2 = bi4Var.f15316D;
        wm0 wm0Var = null;
        ho2 ho2Var = ho2.f20753a;
        d31 d31Var = f19017a;
        ju4 ju4Var = ju4.f22634a;
        byte b = 1;
        switch (i2) {
            case 0:
                k43.m7376J(objM5725i2);
                bi4Var.f15317t = uf4Var5;
                zo0Var2 = zo0Var;
                bi4Var.f15318u = zo0Var2;
                df3Var2 = df3Var;
                bi4Var.f15319v = df3Var2;
                bi4Var.f15320w = null;
                bi4Var.f15321x = null;
                nq1Var2 = nq1Var;
                bi4Var.f15322y = nq1Var2;
                yp1Var2 = yp1Var;
                bi4Var.f15323z = yp1Var2;
                bi4Var.f15316D = 1;
                objM5718b = m5718b(uf4Var5, bi4Var, 3);
                if (objM5718b != ap0Var) {
                    yp1Var3 = null;
                    yp1Var4 = null;
                    lc3Var = (lc3) objM5718b;
                    lc3Var.m7952a();
                    t82VarM7910S = lb5.m7910S(zo0Var2, null, cp0.f16328d, new zh4(df3Var2, wm0Var, b), 1);
                    if (nq1Var2 != d31Var) {
                        df3 df3Var9 = df3Var2;
                        ci4 ci4Var = new ci4(nq1Var2, df3Var9, lc3Var, wm0Var, (byte) 0);
                        df3Var3 = df3Var9;
                        lc3Var2 = lc3Var;
                        m5722f(zo0Var2, t82VarM7910S, ci4Var);
                    } else {
                        df3Var3 = df3Var2;
                        lc3Var2 = lc3Var;
                    }
                    if (yp1Var3 == null) {
                        bi4Var.f15317t = uf4Var5;
                        bi4Var.f15318u = zo0Var2;
                        bi4Var.f15319v = df3Var3;
                        bi4Var.f15320w = yp1Var4;
                        bi4Var.f15321x = yp1Var3;
                        bi4Var.f15322y = nq1Var2;
                        bi4Var.f15323z = yp1Var2;
                        bi4Var.f15313A = t82VarM7910S;
                        bi4Var.f15316D = 2;
                        objM5725i = m5725i(uf4Var5, fc3.f18904b, bi4Var);
                        if (objM5725i != ap0Var) {
                            uf4Var3 = uf4Var5;
                            t82Var = t82VarM7910S;
                            yp1 yp1Var15 = yp1Var4;
                            zo0Var4 = zo0Var2;
                            objM5725i2 = objM5725i;
                            yp1Var6 = yp1Var2;
                            yp1Var7 = yp1Var3;
                            yp1Var8 = yp1Var15;
                            lc3Var3 = (lc3) objM5725i2;
                            df3Var4 = df3Var3;
                            if (lc3Var3 == null) {
                                t82VarM5722f = m5722f(zo0Var4, t82Var, new yh4(df3Var4, wm0Var, (byte) 3));
                            } else {
                                lc3Var3.m7952a();
                                t82VarM5722f = m5722f(zo0Var4, t82Var, new yh4(df3Var4, wm0Var, (byte) 4));
                            }
                            if (lc3Var3 != null) {
                                if (yp1Var8 == null) {
                                    bi4Var.f15317t = uf4Var3;
                                    bi4Var.f15318u = zo0Var4;
                                    bi4Var.f15319v = df3Var4;
                                    bi4Var.f15320w = yp1Var8;
                                    bi4Var.f15321x = yp1Var7;
                                    bi4Var.f15322y = nq1Var2;
                                    bi4Var.f15323z = yp1Var6;
                                    bi4Var.f15313A = lc3Var3;
                                    bi4Var.f15314B = t82VarM5722f;
                                    bi4Var.f15316D = 5;
                                    yp1Var9 = yp1Var6;
                                    nq1Var4 = nq1Var2;
                                    objM11542n = uf4Var3.m11542n(uf4Var3.m11540k().mo5857b(), new v04(lc3Var3, null), bi4Var);
                                    if (objM11542n != ap0Var) {
                                        lc3Var4 = lc3Var3;
                                        objM5725i2 = objM11542n;
                                        yp1Var10 = yp1Var7;
                                        nq1Var5 = nq1Var4;
                                        yp1Var11 = yp1Var9;
                                        yp1Var12 = yp1Var8;
                                        zo0Var5 = zo0Var4;
                                        lc3Var5 = (lc3) objM5725i2;
                                        if (lc3Var5 != null) {
                                            t82VarM7910S2 = lb5.m7910S(zo0Var5, null, cp0.f16328d, new C0682gb(t82VarM5722f, df3Var4, wm0Var, (byte) 8), 1);
                                            if (nq1Var5 != d31Var) {
                                                nq1 nq1Var6 = nq1Var5;
                                                df3 df3Var10 = df3Var4;
                                                df3Var6 = df3Var10;
                                                m5722f(zo0Var5, t82VarM7910S2, new ci4(nq1Var6, df3Var10, lc3Var5, wm0Var, (byte) 1));
                                            } else {
                                                df3Var6 = df3Var4;
                                            }
                                            if (yp1Var10 == null) {
                                                bi4Var.f15317t = zo0Var5;
                                                bi4Var.f15318u = df3Var6;
                                                bi4Var.f15319v = yp1Var12;
                                                bi4Var.f15320w = yp1Var11;
                                                bi4Var.f15321x = t82VarM7910S2;
                                                bi4Var.f15322y = lc3Var4;
                                                bi4Var.f15323z = null;
                                                bi4Var.f15313A = null;
                                                bi4Var.f15314B = null;
                                                bi4Var.f15316D = 6;
                                                objM5725i2 = m5725i(uf4Var3, fc3.f18904b, bi4Var);
                                                if (objM5725i2 != ap0Var) {
                                                    t82Var2 = t82VarM7910S2;
                                                    lc3Var4 = lc3Var4;
                                                    yp1Var14 = yp1Var11;
                                                    zo0Var7 = zo0Var5;
                                                    yp1Var13 = yp1Var12;
                                                    lc3Var7 = (lc3) objM5725i2;
                                                    if (lc3Var7 != null) {
                                                        lc3Var7.m7952a();
                                                        m5722f(zo0Var7, t82Var2, new yh4(df3Var6, wm0Var, (byte) 5));
                                                        yp1Var13.invoke(b33.m3423a(lc3Var7.f23937c));
                                                        return ju4Var;
                                                    }
                                                    m5722f(zo0Var7, t82Var2, new yh4(df3Var6, wm0Var, (byte) 6));
                                                    if (yp1Var14 != null) {
                                                        yp1Var14.invoke(b33.m3423a(lc3Var4.f23937c));
                                                        return ju4Var;
                                                    }
                                                }
                                            } else {
                                                bi4Var.f15317t = uf4Var3;
                                                bi4Var.f15318u = zo0Var5;
                                                bi4Var.f15319v = df3Var6;
                                                bi4Var.f15320w = yp1Var12;
                                                bi4Var.f15321x = yp1Var10;
                                                bi4Var.f15322y = yp1Var11;
                                                bi4Var.f15323z = t82VarM7910S2;
                                                bi4Var.f15313A = lc3Var4;
                                                bi4Var.f15314B = 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x033e: IPUT (r24v2 ?? I:??[OBJECT, ARRAY]), (r2v2 'bi4Var' bi4) (LINE:831) bi4.B java.lang.Object in method: fi4.g(uf4, zo0, df3, nq1, yp1, lx):java.lang.Object, file: classes.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v2 ??
                                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                                    */
                                                /*
                                                    Method dump skipped, instruction units count: 1018
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: p000.fi4.m5723g(uf4, zo0, df3, nq1, yp1, lx):java.lang.Object");
                                            }

                                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                            /* JADX INFO: renamed from: h */
                                            public static final Object m5724h(uf4 uf4Var, fc3 fc3Var, ym0 ym0Var) {
                                                di4 di4Var;
                                                ql3 ql3Var;
                                                if (ym0Var instanceof di4) {
                                                    di4Var = (di4) ym0Var;
                                                    int i = di4Var.f17086v;
                                                    if ((i & Integer.MIN_VALUE) != 0) {
                                                        di4Var.f17086v = i - Integer.MIN_VALUE;
                                                    } else {
                                                        di4Var = new di4(ym0Var);
                                                    }
                                                } else {
                                                    di4Var = new di4(ym0Var);
                                                }
                                                Object obj = di4Var.f17085u;
                                                Object obj2 = ap0.f14763a;
                                                int i2 = di4Var.f17086v;
                                                wm0 wm0Var = null;
                                                try {
                                                    if (i2 == 0) {
                                                        k43.m7376J(obj);
                                                        ql3 ql3Var2 = new ql3();
                                                        ql3Var2.f28555a = fo2.f19179a;
                                                        long jMo5858c = uf4Var.m11540k().mo5858c();
                                                        mq1 bn1Var = new bn1(fc3Var, ql3Var2, wm0Var, (byte) 2);
                                                        di4Var.f17084t = ql3Var2;
                                                        di4Var.f17086v = 1;
                                                        if (uf4Var.m11541l(jMo5858c, bn1Var, di4Var) == obj2) {
                                                            return obj2;
                                                        }
                                                        ql3Var = ql3Var2;
                                                    } else {
                                                        if (i2 != 1) {
                                                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                                            return null;
                                                        }
                                                        ql3Var = di4Var.f17084t;
                                                        k43.m7376J(obj);
                                                    }
                                                    return ql3Var.f28555a;
                                                } catch (gc3 unused) {
                                                    return ho2.f20753a;
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:24:0x0073  */
                                            /* JADX WARN: Code duplicated, block: B:28:0x0089  */
                                            /* JADX WARN: Code duplicated, block: B:30:0x0095  */
                                            /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[LOOP:1: B:23:0x0071->B:44:0x00d7, LOOP_END] */
                                            /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:13:0x0031). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            /* JADX INFO: renamed from: i */
                                            public static final java.lang.Object m5725i(p000.uf4 r17, p000.fc3 r18, p000.AbstractC0888lx r19) {
                                                /*
                                                    Method dump skipped, instruction units count: 223
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: p000.fi4.m5725i(uf4, fc3, lx):java.lang.Object");
                                            }
                                        }
