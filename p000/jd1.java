package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22172a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0950nl f22173b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C1349xz f22174c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ cp1 f22175d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ sp1 f22176e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ qe3 f22177f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ wp1 f22178g;

    public /* synthetic */ jd1(byte b) {
        this.f22172a = b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.f22172a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                cp1 cp1Var = this.f22175d;
                C1349xz c1349xz = this.f22174c;
                qe3 qe3Var = this.f22177f;
                wp1 wp1Var = this.f22178g;
                C0950nl c0950nl = this.f22173b;
                sp1 sp1Var = this.f22176e;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = false;
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    lu2 lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
                    if (cp1Var == null) {
                        z = true;
                    } else if ((c1349xz != null ? z62.m13387o((Boolean) c1349xz.f34730d.getValue(), Boolean.FALSE) : false) || z62.m13387o(qe3Var.mo9873f(), Boolean.TRUE) || (z62.m13387o(qe3Var.mo9873f(), Boolean.FALSE) && wp1Var.invoke() != null)) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zM6890g = ir1Var.m6890g(lu2Var);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        obj3 = objM6869O;
                        C0713h5 c0713h5 = new C0713h5((byte) 2);
                        c0713h5.f20393b = lu2Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0713h5);
                        obj3 = c0713h5;
                    }
                    obj3 = objM6869O;
                    kd1 kd1Var = new kd1();
                    kd1Var.f23074a = c0950nl;
                    kd1Var.f23075b = c1349xz;
                    kd1Var.f23076c = qe3Var;
                    kd1Var.f23077d = sp1Var;
                    kd1Var.f23078e = cp1Var;
                    VarHandle.storeStoreFence();
                    ev0.m5331F(boolValueOf, null, (yp1) obj3, null, null, null, vd6.m11834R(-168092100, kd1Var, ir1Var), ir1Var, 1572864, 58);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pd1.m9497b(this.f22173b, this.f22174c, this.f22175d, this.f22176e, this.f22177f, this.f22178g, (mi0) obj, vd6.m11838V(196609));
                break;
        }
        return ju4Var;
    }
}
