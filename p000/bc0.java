package p000;

import com.materialkolor.ktx.ColorKt;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bc0 {

    /* JADX INFO: renamed from: a */
    public static final List f15200a;

    static {
        pb0 pb0VarM9462a = pb0.m9462a(zy5.m13870e(4294198070L));
        pb0 pb0VarM9462a2 = pb0.m9462a(zy5.m13870e(4293467747L));
        pb0 pb0VarM9462a3 = pb0.m9462a(zy5.m13870e(4288423856L));
        pb0 pb0VarM9462a4 = pb0.m9462a(zy5.m13870e(4284955319L));
        pb0 pb0VarM9462a5 = pb0.m9462a(zy5.m13870e(4282339765L));
        pb0 pb0VarM9462a6 = pb0.m9462a(zy5.m13870e(4280391411L));
        pb0 pb0VarM9462a7 = pb0.m9462a(zy5.m13870e(4278430196L));
        pb0 pb0VarM9462a8 = pb0.m9462a(zy5.m13870e(4278238420L));
        pb0 pb0VarM9462a9 = pb0.m9462a(zy5.m13870e(4278228616L));
        pb0 pb0VarM9462a10 = pb0.m9462a(zy5.m13870e(4283215696L));
        pb0 pb0VarM9462a11 = pb0.m9462a(zy5.m13870e(4287349578L));
        pb0 pb0VarM9462a12 = pb0.m9462a(zy5.m13870e(4291681337L));
        pb0 pb0VarM9462a13 = pb0.m9462a(zy5.m13870e(4294961979L));
        pb0 pb0VarM9462a14 = pb0.m9462a(zy5.m13870e(4294951175L));
        pb0 pb0VarM9462a15 = pb0.m9462a(zy5.m13870e(4294940672L));
        pb0 pb0VarM9462a16 = pb0.m9462a(zy5.m13870e(4294924066L));
        int i = pb0.f27502i;
        f15200a = kx5.m7694Y(pb0VarM9462a, pb0VarM9462a2, pb0VarM9462a3, pb0VarM9462a4, pb0VarM9462a5, pb0VarM9462a6, pb0VarM9462a7, pb0VarM9462a8, pb0VarM9462a9, pb0VarM9462a10, pb0VarM9462a11, pb0VarM9462a12, pb0VarM9462a13, pb0VarM9462a14, pb0VarM9462a15, pb0VarM9462a16, pb0.m9462a(pb0.f27495b), pb0.m9462a(pb0.f27497d));
    }

    /* JADX INFO: renamed from: a */
    public static final void m3543a(long j, String str, List list, yp1 yp1Var, mi0 mi0Var, int i) {
        String str2;
        List list2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1711549736);
        int i2 = i | (ir1Var.m6888f(j) ? 4 : 2) | 3504 | (ir1Var.m6894i(yp1Var) ? 16384 : 8192);
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(pb0.m9462a(j));
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                String strM6337c0 = hd4.m6337c0(1, ColorKt.m13929toHexIv8Zu3U$default(m3544b(sw2Var), false, null, false, 3, null));
                int length = strM6337c0.length();
                objM6869O2 = k43.m7398w(new xk4(4, sc6.m10657b(length, length), strM6337c0));
                ir1Var.m6905n0(objM6869O2);
            }
            sw2 sw2Var2 = (sw2) objM6869O2;
            boolean zM6886e = ir1Var.m6886e(6) | ((i2 & 57344) == 16384);
            Object objM6869O3 = ir1Var.m6869O();
            list2 = f15200a;
            Object obj = objM6869O3;
            if (zM6886e || objM6869O3 == i50Var) {
                qb0 qb0Var = new qb0(b);
                qb0Var.f28352b = 6;
                qb0Var.f28353c = yp1Var;
                qb0Var.f28354d = sw2Var;
                qb0Var.f28355e = sw2Var2;
                qb0Var.f28356f = list2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(qb0Var);
                obj = qb0Var;
            }
            str2 = "Pick a color";
            AbstractC0647fd.m5668f(null, "Pick a color", false, null, (yp1) obj, ir1Var, 48, 13);
        } else {
            ir1Var.m6874W();
            str2 = str;
            list2 = list;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            wb0 wb0Var = new wb0();
            wb0Var.f33208a = j;
            wb0Var.f33209b = str2;
            wb0Var.f33210c = list2;
            wb0Var.f33211d = yp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = wb0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m3544b(sw2 sw2Var) {
        return ((pb0) sw2Var.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m3545c(sw2 sw2Var, String str, float f, mq1 mq1Var, ir1 ir1Var) {
        dc0 dc0VarM13638b = AbstractC1410zm.m13638b(false, false, null, pb0.m9462a(m3544b(sw2Var)), null, null, ir1Var, 0, 239);
        dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
        dc0 dc0Var2 = new dc0(dc0Var.f16940a, dc0Var.f16942b, dc0Var.f16944c, dc0Var.f16946d, dc0Var.f16948e, dc0Var.f16949f, dc0Var.f16950g, dc0Var.f16951h, dc0Var.f16952i, dc0VarM13638b.f16940a, dc0VarM13638b.f16942b, dc0Var.f16955l, dc0Var.f16956m, dc0Var.f16957n, dc0Var.f16958o, dc0Var.f16959p, dc0Var.f16960q, dc0Var.f16961r, dc0Var.f16962s, dc0Var.f16963t, dc0Var.f16964u, dc0Var.f16965v, dc0Var.f16966w, dc0Var.f16967x, dc0Var.f16968y, dc0Var.f16969z, dc0Var.f16914A, dc0Var.f16915B, dc0Var.f16916C, dc0Var.f16917D, dc0Var.f16918E, dc0Var.f16919F, dc0Var.f16920G, dc0Var.f16921H, dc0Var.f16922I, dc0Var.f16923J, dc0Var.f16924K, dc0Var.f16925L, dc0Var.f16926M, dc0Var.f16927N, dc0Var.f16928O, dc0Var.f16929P, dc0Var.f16930Q, dc0Var.f16931R, dc0Var.f16932S, dc0Var.f16933T, dc0Var.f16934U, dc0Var.f16935V);
        tb0 tb0Var = new tb0();
        tb0Var.f31047a = f;
        tb0Var.f31048b = mq1Var;
        tb0Var.f31049c = str;
        VarHandle.storeStoreFence();
        pq2.m9600c(dc0Var2, null, null, vd6.m11834R(-2091862644, tb0Var, ir1Var), ir1Var, 3072, 6);
    }

    /* JADX INFO: renamed from: d */
    public static void m3546d(yp1 yp1Var, sw2 sw2Var, sw2 sw2Var2, long j, boolean z) {
        sw2Var.setValue(pb0.m9462a(j));
        String strM6337c0 = hd4.m6337c0(1, ColorKt.m13929toHexIv8Zu3U$default(j, false, null, false, 3, null));
        int length = strM6337c0.length();
        sw2Var2.setValue(new xk4(4, sc6.m10657b(length, length), strM6337c0));
        if (!z || yp1Var == null) {
            return;
        }
        yp1Var.invoke(pb0.m9462a(j));
    }
}
