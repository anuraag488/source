package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jh2 {

    /* JADX INFO: renamed from: a */
    public lw2 f22272a;

    /* JADX INFO: renamed from: b */
    public C0795je f22273b;

    /* JADX INFO: renamed from: c */
    public int f22274c;

    /* JADX INFO: renamed from: d */
    public mw2 f22275d;

    /* JADX INFO: renamed from: e */
    public ArrayList f22276e;

    /* JADX INFO: renamed from: f */
    public ArrayList f22277f;

    /* JADX INFO: renamed from: g */
    public ArrayList f22278g;

    /* JADX INFO: renamed from: h */
    public ArrayList f22279h;

    /* JADX INFO: renamed from: i */
    public ArrayList f22280i;

    /* JADX INFO: renamed from: j */
    public r01 f22281j;

    /* JADX INFO: renamed from: b */
    public static void m7122b(ni2 ni2Var, int i, hh2 hh2Var, boolean z) {
        int i2 = 0;
        long jM8776c = ni2Var.m8776c(0);
        long jM8955b = z ? o52.m8955b(0, i, 1, jM8776c) : o52.m8955b(i, 0, 2, jM8776c);
        fh2[] fh2VarArr = hh2Var.f20575a;
        int length = fh2VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            fh2 fh2Var = fh2VarArr[i2];
            int i4 = i3 + 1;
            if (fh2Var != null) {
                fh2Var.f18993l = o52.m8958e(jM8955b, o52.m8957d(ni2Var.m8776c(i3), jM8776c));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m7123g(int[] iArr, ni2 ni2Var, boolean z) {
        ni2Var.getClass();
        int iM5524D = C0638f5.m5524D(ni2Var, z) + iArr[0];
        iArr[0] = iM5524D;
        return Math.max(0, iM5524D);
    }

    /* JADX INFO: renamed from: a */
    public final long m7124a() {
        ArrayList arrayList = this.f22280i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            fh2 fh2Var = (fh2) arrayList.get(i);
            bu1 bu1Var = fh2Var.f18996o;
            if (bu1Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (fh2Var.f18993l >> 32)) + ((int) (bu1Var.f15628u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (fh2Var.f18993l & 4294967295L)) + ((int) (bu1Var.f15628u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0427  */
    /* JADX WARN: Code duplicated, block: B:207:0x050b  */
    /* JADX WARN: Code duplicated, block: B:254:0x00fd A[EDGE_INSN: B:254:0x00fd->B:48:0x00fd BREAK  A[LOOP:2: B:35:0x00bd->B:47:0x00f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7 A[LOOP:2: B:35:0x00bd->B:47:0x00f7, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [cp0, ro0] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [wm0] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v23, types: [fh2[]] */
    /* JADX WARN: Type inference failed for: r5v46, types: [fh2[]] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    /* JADX INFO: renamed from: c */
    public final void m7125c(int r50, int r51, int r52, java.util.ArrayList r53, p000.C0795je r54, p000.ki2 r55, boolean r56, boolean r57, boolean r58, int r59, int r60, p000.zo0 r61, p000.au1 r62) {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jh2.m7125c(int, int, int, java.util.ArrayList, je, ki2, boolean, boolean, boolean, int, int, zo0, au1):void");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m7126d() {
        lw2 lw2Var = this.f22272a;
        if (lw2Var.m8135j()) {
            Object[] objArr = lw2Var.f24420c;
            long[] jArr = lw2Var.f24418a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (fh2 fh2Var : ((hh2) objArr[(i << 3) + i3]).f20575a) {
                                    if (fh2Var != null) {
                                        fh2Var.m5712c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            lw2Var.m8126a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7127e(Object obj) {
        fh2[] fh2VarArr;
        hh2 hh2Var = (hh2) this.f22272a.m8136k(obj);
        if (hh2Var == null || (fh2VarArr = hh2Var.f20575a) == null) {
            return;
        }
        for (fh2 fh2Var : fh2VarArr) {
            if (fh2Var != null) {
                fh2Var.m5712c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX INFO: renamed from: f */
    public final void m7128f(ni2 ni2Var, boolean z) {
        fh2[] fh2VarArr = ((hh2) this.f22272a.m8132g(ni2Var.f25855j)).f20575a;
        int length = fh2VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            fh2 fh2Var = fh2VarArr[i];
            int i3 = i2 + 1;
            if (fh2Var != null) {
                d83 d83Var = fh2Var.f18999r;
                long jM8776c = ni2Var.m8776c(i2);
                long j = fh2Var.f18993l;
                if (!o52.m8956c(j, 9223372034707292159L) && !o52.m8956c(j, jM8776c)) {
                    long jM8957d = o52.m8957d(jM8776c, j);
                    ag1 ag1Var = fh2Var.f18986e;
                    if (ag1Var != null) {
                        long jM8957d2 = o52.m8957d(((o52) d83Var.getValue()).f26352a, jM8957d);
                        d83Var.setValue(o52.m8954a(jM8957d2));
                        fh2Var.f18989h.setValue(Boolean.TRUE);
                        fh2Var.f18988g = z;
                        lb5.m7910S(fh2Var.f18982a, null, null, new C0708h0(fh2Var, ag1Var, jM8957d2, (wm0) null), 3);
                    }
                }
                fh2Var.f18993l = jM8776c;
            }
            i++;
            i2 = i3;
        }
    }
}
