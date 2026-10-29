package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd1 implements oq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0950nl f23074a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1349xz f23075b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ qe3 f23076c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sp1 f23077d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ cp1 f23078e;

    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zM6890g;
        Object objM6869O;
        pz2 pz2VarM10509b;
        Boolean boolMo9873f;
        Boolean bool;
        boolean z;
        C0950nl c0950nl = this.f23074a;
        C1349xz c1349xz = this.f23075b;
        pg0 pg0Var = zy5.f36476e;
        qe3 qe3Var = this.f23076c;
        sp1 sp1Var = this.f23077d;
        cp1 cp1Var = this.f23078e;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        mi0 mi0Var = (mi0) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= ((ir1) mi0Var).m6892h(zBooleanValue) ? 32 : 16;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 145) != 144)) {
            if (zBooleanValue) {
                ir1Var.m6885d0(300293792);
                if (c0950nl.f25920a) {
                    ir1Var.m6885d0(300424240);
                    zM6890g = ir1Var.m6890g(pg0Var);
                    objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        objM6869O = new fj0((byte) 10);
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(objM6869O);
                    }
                    pz2VarM10509b = rz2.m10509b((wp1) objM6869O, ir1Var);
                    boolMo9873f = qe3Var.mo9873f();
                    bool = Boolean.FALSE;
                    if (z62.m13387o(boolMo9873f, bool)) {
                        ir1Var.m6885d0(300554347);
                        oh6.m9099e(sp1Var, pz2VarM10509b, 0, ir1Var, 0);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(300641798);
                        ir1Var.m6912r(false);
                    }
                    if ((cp1Var != null ? "ca-app-pub-9158627376176162/3214584219" : null) == null && z62.m13387o(qe3Var.mo9873f(), bool)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1016p c1016p = new C1016p((byte) 2);
                    c1016p.f27252b = c0950nl;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(1487216928, c1016p, ir1Var);
                    C1017p0 c1017p0 = new C1017p0((byte) 18);
                    c1017p0.f27254b = pz2VarM10509b;
                    VarHandle.storeStoreFence();
                    lb5.m7920b(z, null, pg0VarM11834R, vd6.m11834R(-384644801, c1017p0, ir1Var), ir1Var, 3456);
                    ir1Var.m6912r(false);
                } else {
                    if (c1349xz != null ? z62.m13387o((Boolean) c1349xz.f34730d.getValue(), Boolean.FALSE) : false) {
                        ir1Var.m6885d0(300351638);
                        y62.m12965e(0, ir1Var);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(300424240);
                        zM6890g = ir1Var.m6890g(pg0Var);
                        objM6869O = ir1Var.m6869O();
                        if (zM6890g) {
                            objM6869O = new fj0((byte) 10);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        } else {
                            objM6869O = new fj0((byte) 10);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        }
                        pz2VarM10509b = rz2.m10509b((wp1) objM6869O, ir1Var);
                        boolMo9873f = qe3Var.mo9873f();
                        bool = Boolean.FALSE;
                        if (z62.m13387o(boolMo9873f, bool)) {
                            ir1Var.m6885d0(300554347);
                            oh6.m9099e(sp1Var, pz2VarM10509b, 0, ir1Var, 0);
                            ir1Var.m6912r(false);
                        } else {
                            ir1Var.m6885d0(300641798);
                            ir1Var.m6912r(false);
                        }
                        if ((cp1Var != null ? "ca-app-pub-9158627376176162/3214584219" : null) == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        C1016p c1016p2 = new C1016p((byte) 2);
                        c1016p2.f27252b = c0950nl;
                        VarHandle.storeStoreFence();
                        pg0 pg0VarM11834R2 = vd6.m11834R(1487216928, c1016p2, ir1Var);
                        C1017p0 c1017p1 = new C1017p0((byte) 18);
                        c1017p1.f27254b = pz2VarM10509b;
                        VarHandle.storeStoreFence();
                        lb5.m7920b(z, null, pg0VarM11834R2, vd6.m11834R(-384644801, c1017p1, ir1Var), ir1Var, 3456);
                        ir1Var.m6912r(false);
                    }
                }
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(300150417);
                eh3.m5127a(n74.m8585m(n74.f25506c, null, 3), 0L, 0.0f, 0L, 0, 0.0f, ir1Var, 6);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
