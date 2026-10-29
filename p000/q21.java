package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class q21 {

    /* JADX INFO: renamed from: a */
    public static final float f28157a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084 A[LOOP:0: B:23:0x0070->B:27:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0088 A[EDGE_INSN: B:54:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:23:0x0070->B:27:0x0084], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m9706a(p000.uf4 r17, long r18, p000.ym0 r20) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q21.m9706a(uf4, long, ym0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [ql3] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX INFO: renamed from: b */
    public static final Object m9707b(uf4 uf4Var, long j, ym0 ym0Var) {
        k21 k21Var;
        Object obj;
        lc3 lc3Var;
        ml3 ml3Var;
        if (ym0Var instanceof k21) {
            k21Var = (k21) ym0Var;
            int i = k21Var.f22831x;
            if ((i & Integer.MIN_VALUE) != 0) {
                k21Var.f22831x = i - Integer.MIN_VALUE;
            } else {
                k21Var = new k21(ym0Var);
            }
        } else {
            k21Var = new k21(ym0Var);
        }
        Object obj2 = k21Var.f22830w;
        Object obj3 = ap0.f14763a;
        int i2 = k21Var.f22831x;
        try {
            if (i2 == 0) {
                k43.m7376J(obj2);
                if (!m9711f(uf4Var.f31830f.f32573s, j)) {
                    List list = uf4Var.f31830f.f32573s.f18000a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (c20.m3818m(((lc3) obj).f23935a, j)) {
                            break;
                        }
                        i3++;
                    }
                    lc3Var = (lc3) obj;
                    if (lc3Var != null) {
                        ql3 ql3Var = new ql3();
                        ql3 ql3Var2 = new ql3();
                        ql3Var2.f28555a = lc3Var;
                        long jMo5858c = uf4Var.m11540k().mo5858c();
                        ml3 ml3Var2 = new ml3();
                        mq1 l21Var = new l21(ml3Var2, ql3Var2, ql3Var, null);
                        k21Var.f22827t = lc3Var;
                        k21Var.f22828u = ql3Var;
                        k21Var.f22829v = ml3Var2;
                        k21Var.f22831x = 1;
                        if (uf4Var.m11541l(jMo5858c, l21Var, k21Var) == obj3) {
                            return obj3;
                        }
                        ml3Var = ml3Var2;
                        j = ql3Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ml3Var = k21Var.f22829v;
            ql3 ql3Var3 = k21Var.f22828u;
            lc3Var = k21Var.f22827t;
            k43.m7376J(obj2);
            j = ql3Var3;
            if (ml3Var.f25002a) {
                lc3 lc3Var2 = (lc3) j.f28555a;
                return lc3Var2 == null ? lc3Var : lc3Var2;
            }
            return null;
        } catch (gc3 unused) {
            lc3 lc3Var3 = (lc3) j.f28555a;
            return lc3Var3 == null ? lc3Var : lc3Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[LOOP:0: B:26:0x00c0->B:30:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00de A[EDGE_INSN: B:68:0x00de->B:32:0x00de BREAK  A[LOOP:0: B:26:0x00c0->B:30:0x00d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016e -> B:62:0x0174). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m9708c(p000.uf4 r18, long r19, p000.u04 r21, p000.AbstractC0888lx r22) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q21.m9708c(uf4, long, u04, lx):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static final Object m9709d(pc3 pc3Var, yp1 yp1Var, wp1 wp1Var, wp1 wp1Var2, mq1 mq1Var, of4 of4Var) {
        i21 i21Var = new i21((byte) 0);
        i21Var.f21061b = yp1Var;
        VarHandle.storeStoreFence();
        C0729hl c0729hl = new C0729hl((byte) 1);
        c0729hl.f20669b = wp1Var;
        VarHandle.storeStoreFence();
        Object objM6084i = gq6.m6084i(pc3Var, new n21(new fj0((byte) 6), i21Var, mq1Var, wp1Var2, c0729hl, null), of4Var);
        ap0 ap0Var = ap0.f14763a;
        ju4 ju4Var = ju4.f22634a;
        if (objM6084i != ap0Var) {
            objM6084i = ju4Var;
        }
        return objM6084i == ap0Var ? objM6084i : ju4Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static final java.lang.Object m9710e(p000.uf4 r4, long r5, p000.yp1 r7, p000.ym0 r8) {
        /*
            boolean r0 = r8 instanceof p000.o21
            if (r0 == 0) goto L13
            r0 = r8
            o21 r0 = (p000.o21) r0
            int r1 = r0.f26299w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26299w = r1
            goto L18
        L13:
            o21 r0 = new o21
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26298v
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f26299w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            yp1 r4 = r0.f26297u
            yp1 r4 = (p000.yp1) r4
            uf4 r5 = r0.f26296t
            p000.k43.m7376J(r8)
            r7 = r4
            r4 = r5
            goto L49
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r4)
            r4 = 0
            return r4
        L36:
            p000.k43.m7376J(r8)
        L39:
            r0.f26296t = r4
            r8 = r7
            yp1 r8 = (p000.yp1) r8
            r0.f26297u = r8
            r0.f26299w = r3
            java.lang.Object r8 = m9706a(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            lc3 r8 = (p000.lc3) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = p000.AbstractC1356y5.m12923q(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.f23935a
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q21.m9710e(uf4, long, yp1, ym0):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m9711f(ec3 ec3Var, long j) {
        Object obj;
        List list = ec3Var.f18000a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (c20.m3818m(((lc3) obj).f23935a, j)) {
                break;
            }
            i++;
        }
        lc3 lc3Var = (lc3) obj;
        if (lc3Var != null && lc3Var.f23938d) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX INFO: renamed from: g */
    public static final float m9712g(fy4 fy4Var, int i) {
        return i == 2 ? fy4Var.mo5859d() * f28157a : fy4Var.mo5859d();
    }

    /* JADX WARN: Code duplicated, block: B:233:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0297  */
    /* JADX WARN: Code duplicated, block: B:42:0x02b3 A[LOOP:8: B:38:0x0295->B:42:0x02b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x041a -> B:91:0x03c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0458 -> B:164:0x05bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0462 -> B:117:0x0477). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0599 -> B:159:0x059f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x05b4 -> B:164:0x05bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0619 -> B:174:0x061c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0235 -> B:31:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02ce -> B:31:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0328 -> B:77:0x0390). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x037c -> B:74:0x0385). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public static final java.lang.Object m9713h(p000.uf4 r26, p000.lc3 r27, p000.fj0 r28, p000.i21 r29, p000.mq1 r30, p000.wp1 r31, p000.C0729hl r32, p000.AbstractC0888lx r33) {
        /*
            Method dump skipped, instruction units count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q21.m9713h(uf4, lc3, fj0, i21, mq1, wp1, hl, lx):java.lang.Object");
    }
}
