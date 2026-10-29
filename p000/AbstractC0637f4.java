package p000;

import java.lang.invoke.VarHandle;
import org.chromium.net.NetError;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637f4 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f18723a;

    static {
        bs4 bs4VarM10362b = rl3.m10362b(C1354y3.class);
        C0598e4 c0598e4 = new C0598e4((byte) 0);
        c0598e4.f17678b = bs4VarM10362b;
        VarHandle.storeStoreFence();
        f18723a = as4.m3263v(c0598e4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5466a(C0004a3 c0004a3, C1354y3 c1354y3, mi0 mi0Var, int i, int i2) {
        int i3;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(824397808);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(c0004a3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && ir1Var.m6890g(c1354y3)) ? 32 : 16;
        }
        byte b = 1;
        if (ir1Var.m6871T(i3 & 1, (i3 & 19) != 18)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
            } else if ((i2 & 2) != 0) {
                c1354y3 = (C1354y3) ir1Var.m6898k(f18723a);
                i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            }
            ir1Var.m6913s();
            boolean z = ((((i3 & 112) ^ 48) > 32 && ir1Var.m6890g(c1354y3)) || (i3 & 48) == 32) | ((i3 & 14) == 4);
            Object objM6869O = ir1Var.m6869O();
            if (z || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0558d0 c0558d0 = new C0558d0(b);
                c0558d0.f16655b = c1354y3;
                c0558d0.f16656c = c0004a3;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj = c0558d0;
            }
            obj = objM6869O;
            lb5.m7924e(c1354y3, c0004a3, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0514c4 c0514c4 = new C0514c4();
            c0514c4.f15789a = c0004a3;
            c0514c4.f15790b = c1354y3;
            c0514c4.f15791c = i;
            c0514c4.f15792d = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0514c4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m5467b(int i, boolean z, C1354y3 c1354y3, yp1 yp1Var, mi0 mi0Var, int i2, int i3) {
        int i4;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1222679723);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            i4 = (ir1Var.m6892h(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | 128 | (ir1Var.m6894i(yp1Var) ? 2048 : 1024);
        byte b = 0;
        if (ir1Var.m6871T(i6 & 1, (i6 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i2 & 1) == 0 || ir1Var.m6856B()) {
                if (i5 != 0) {
                    z = false;
                }
                c1354y3 = (C1354y3) ir1Var.m6898k(f18723a);
            } else {
                ir1Var.m6874W();
            }
            int i7 = i6 & (-897);
            ir1Var.m6913s();
            boolean z2 = (i7 & 112) == 32;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (z2 || objM6869O == i50Var) {
                objM6869O = new C0004a3(i, !z ? 0 : 2);
                ir1Var.m6905n0(objM6869O);
            }
            m5466a((C0004a3) objM6869O, c1354y3, ir1Var, 0, 0);
            Integer numValueOf = Integer.valueOf(i);
            boolean zM6890g = ir1Var.m6890g(c1354y3) | ((i7 & 7168) == 2048);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6890g || objM6869O2 == i50Var) {
                C0005a4 c0005a4 = new C0005a4(b);
                c0005a4.f88c = c1354y3;
                c0005a4.f87b = i;
                c0005a4.f89d = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0005a4);
                obj = c0005a4;
            }
            lb5.m7925f(c1354y3, numValueOf, yp1Var, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0478b4 c0478b4 = new C0478b4();
            c0478b4.f15065a = i;
            c0478b4.f15066b = z;
            c0478b4.f15067c = c1354y3;
            c0478b4.f15068d = yp1Var;
            c0478b4.f15069e = i2;
            c0478b4.f15070f = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0478b4;
        }
    }
}
