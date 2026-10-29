package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class no4 extends o13 {

    /* JADX INFO: renamed from: f */
    public f40 f25983f;

    /* JADX INFO: renamed from: g */
    public t82 f25984g;

    /* JADX INFO: renamed from: e */
    public static lo4 m8803e(f40 f40Var) {
        mu2 mu2Var = new mu2((byte) 1);
        mu2Var.f25221b = f40Var;
        VarHandle.storeStoreFence();
        lo4 lo4Var = null;
        b24 b24VarM4325z = d24.m4325z(new p13(mu2Var, null));
        while (b24VarM4325z.hasNext()) {
            lo4 lo4VarM8062a = (lo4) b24VarM4325z.next();
            if (lo4Var != null) {
                lo4VarM8062a = lo4Var.m8062a(lo4VarM8062a);
            }
            lo4Var = lo4VarM8062a;
        }
        return lo4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if (r16.f26285b.invoke(r0, r6) == r7) goto L25;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8804c(vy3 vy3Var, lo4 lo4Var, ym0 ym0Var) {
        mo4 mo4Var;
        if (ym0Var instanceof mo4) {
            mo4Var = (mo4) ym0Var;
            int i = mo4Var.f25086v;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo4Var.f25086v = i - Integer.MIN_VALUE;
            } else {
                mo4Var = new mo4(this, ym0Var);
            }
        } else {
            mo4Var = new mo4(this, ym0Var);
        }
        mo4 mo4Var2 = mo4Var;
        Object obj = mo4Var2.f25084t;
        Object obj2 = ap0.f14763a;
        int i2 = mo4Var2.f25086v;
        nh3 nh3Var = this.f26288e;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
            }
            return ju4.f22634a;
        }
        k43.m7376J(obj);
        ql3 ql3Var = new ql3();
        ql3Var.f28555a = lo4Var;
        long j = lo4Var.f24232b;
        long j2 = lo4Var.f24231a;
        ((lx4) nh3Var.f25810b).m8145a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((lx4) nh3Var.f25811c).m8145a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
        lo4 lo4VarM8803e = m8803e(this.f25983f);
        if (lo4VarM8803e != null) {
            long j3 = lo4VarM8803e.f24232b;
            long j4 = lo4VarM8803e.f24231a;
            ((lx4) nh3Var.f25810b).m8145a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((lx4) nh3Var.f25811c).m8145a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            ql3Var.f28555a = ((lo4) ql3Var.f28555a).m8062a(lo4VarM8803e);
        }
        mq1 c0980oe = new C0980oe((Object) this, (Object) vy3Var, (Object) ql3Var, (wm0) null, (byte) 11);
        mo4Var2.f25086v = 1;
        if (m8919b(c0980oe, mo4Var2) != obj2) {
        }
        return obj2;
        jx4 jx4VarM7330a = jx4.m7330a(qs5.m10097b(((lx4) nh3Var.f25810b).m8147c(Float.MAX_VALUE), ((lx4) nh3Var.f25811c).m8147c(Float.MAX_VALUE)));
        mo4Var2.f25086v = 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8805d(ec3 ec3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        vy3 vy3Var;
        f40 f40Var = this.f25983f;
        lc3 lc3Var = (lc3) hb0.m6301M0(ec3Var.f18000a);
        if (lc3Var != null) {
            List listM7953b = lc3Var.m7953b();
            int size = listM7953b.size();
            int i = 0;
            z3 = false;
            while (true) {
                vy3Var = this.f26284a;
                if (i >= size) {
                    break;
                }
                mw1 mw1Var = (mw1) listM7953b.get(i);
                long j = mw1Var.f25255d ^ (-9223372034707292160L);
                if (!(vy3Var.m12037j(vy3Var.m12033f(j)) == 0.0f)) {
                    z3 = !(f40Var.mo5493n(new lo4(j, mw1Var.f25252a, false)) instanceof n80) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = lc3Var.f23946l ^ (-9223372034707292160L);
            boolean z4 = ec3Var.f18005f == 12;
            if (!(vy3Var.m12037j(vy3Var.m12033f(j2)) == 0.0f) || z4) {
                if (!(f40Var.mo5493n(new lo4(j2, lc3Var.f23936b, z4)) instanceof n80) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f26287d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
