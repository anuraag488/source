package p000;

import android.view.Choreographer;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: renamed from: ph */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1034ph implements vt2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27602a;

    /* JADX INFO: renamed from: b */
    public Object f27603b;

    /* JADX INFO: renamed from: c */
    public Object f27604c;

    public C1034ph(wp1 wp1Var) {
        this.f27602a = (byte) 2;
        this.f27603b = wp1Var;
        this.f27604c = new C1122rv((byte) 0);
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        switch (this.f27602a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public final po0 get(qo0 qo0Var) {
        switch (this.f27602a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // p000.vt2
    /* JADX INFO: renamed from: l */
    public final Object mo9530l(yp1 yp1Var, wm0 wm0Var) {
        m93 m93Var;
        boolean z;
        Object objM3495r;
        byte b = 2;
        byte b2 = 1;
        switch (this.f27602a) {
            case 0:
                C0946nh c0946nh = (C0946nh) this.f27604c;
                b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
                b70Var.m3497u();
                ChoreographerFrameCallbackC0983oh choreographerFrameCallbackC0983oh = new ChoreographerFrameCallbackC0983oh();
                choreographerFrameCallbackC0983oh.f26689a = b70Var;
                choreographerFrameCallbackC0983oh.f26690b = yp1Var;
                VarHandle.storeStoreFence();
                if (z62.m13387o(c0946nh.f25789b, (Choreographer) this.f27603b)) {
                    synchronized (c0946nh.f25791d) {
                        c0946nh.f25793f.add(choreographerFrameCallbackC0983oh);
                        if (!c0946nh.f25796i) {
                            c0946nh.f25796i = true;
                            c0946nh.f25789b.postFrameCallback(c0946nh.f25797j);
                        }
                        break;
                    }
                    C0686gf c0686gf = new C0686gf(b2);
                    c0686gf.f19762b = c0946nh;
                    c0686gf.f19763c = choreographerFrameCallbackC0983oh;
                    VarHandle.storeStoreFence();
                    b70Var.m3499w(c0686gf);
                } else {
                    ((Choreographer) this.f27603b).postFrameCallback(choreographerFrameCallbackC0983oh);
                    C0686gf c0686gf2 = new C0686gf(b);
                    c0686gf2.f19762b = this;
                    c0686gf2.f19763c = choreographerFrameCallbackC0983oh;
                    VarHandle.storeStoreFence();
                    b70Var.m3499w(c0686gf2);
                }
                Object objM3495r2 = b70Var.m3495r();
                ap0 ap0Var = ap0.f14763a;
                return objM3495r2;
            case 1:
                return (wv1.f33760c > 0 ? (vt2) this.f27603b : (vy4) this.f27604c).mo9530l(yp1Var, wm0Var);
            case 2:
                b70 b70Var2 = new b70(1, C0006a5.m86x(wm0Var));
                b70Var2.m3497u();
                C1122rv c1122rv = (C1122rv) this.f27604c;
                n30 n30Var = new n30();
                n30Var.f25416a = b70Var2;
                n30Var.f25417b = yp1Var;
                d70 d70VarM10447f = c1122rv.m10447f(n30Var, (wp1) this.f27603b);
                C1143sf c1143sf = new C1143sf(b);
                c1143sf.f30223b = d70VarM10447f;
                VarHandle.storeStoreFence();
                b70Var2.m3499w(c1143sf);
                Object objM3495r3 = b70Var2.m3495r();
                ap0 ap0Var2 = ap0.f14763a;
                return objM3495r3;
            default:
                if (wm0Var instanceof m93) {
                    m93Var = (m93) wm0Var;
                    int i = m93Var.f24770w;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        m93Var.f24770w = i - Integer.MIN_VALUE;
                    } else {
                        m93Var = new m93(this, wm0Var);
                    }
                } else {
                    m93Var = new m93(this, wm0Var);
                }
                Object obj = m93Var.f24768u;
                ap0 ap0Var3 = ap0.f14763a;
                int i2 = m93Var.f24770w;
                if (i2 == 0) {
                    k43.m7376J(obj);
                    C1126rz c1126rz = (C1126rz) this.f27604c;
                    m93Var.f24767t = yp1Var;
                    m93Var.f24770w = 1;
                    synchronized (c1126rz.f29738b) {
                        z = c1126rz.f29737a;
                    }
                    if (z) {
                        objM3495r = ju4.f22634a;
                    } else {
                        b70 b70Var3 = new b70(1, C0006a5.m86x(m93Var));
                        b70Var3.m3497u();
                        synchronized (c1126rz.f29738b) {
                            ((ArrayList) c1126rz.f29740d).add(b70Var3);
                        }
                        C0686gf c0686gf3 = new C0686gf((byte) 10);
                        c0686gf3.f19762b = c1126rz;
                        c0686gf3.f19763c = b70Var3;
                        VarHandle.storeStoreFence();
                        b70Var3.m3499w(c0686gf3);
                        objM3495r = b70Var3.m3495r();
                        if (objM3495r != ap0Var3) {
                            objM3495r = ju4.f22634a;
                        }
                    }
                    if (objM3495r != ap0Var3) {
                    }
                    return ap0Var3;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yp1Var = m93Var.f24767t;
                k43.m7376J(obj);
                vt2 vt2Var = (vt2) this.f27603b;
                m93Var.f24767t = null;
                m93Var.f24770w = 2;
                Object objMo9530l = vt2Var.mo9530l(yp1Var, m93Var);
                if (objMo9530l != ap0Var3) {
                    return objMo9530l;
                }
                return ap0Var3;
        }
    }

    @Override // p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        switch (this.f27602a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        switch (this.f27602a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return qs5.m10089N(this, ro0Var);
    }

    public /* synthetic */ C1034ph(byte b) {
        this.f27602a = b;
    }
}
