package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca3 implements wr1 {

    /* JADX INFO: renamed from: a */
    public static final ca3 f15905a;
    private static final g24 descriptor;

    static {
        ca3 ca3Var = new ca3();
        f15905a = ca3Var;
        dc3 dc3Var = new dc3("essentials.control.PersistedShortcut", ca3Var, 3);
        dc3Var.m4438l("title", false);
        dc3Var.m4438l("intentUri", false);
        dc3Var.m4438l("iconBytes", false);
        descriptor = dc3Var;
    }

    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final jc2[] mo3932a() {
        fd4 fd4Var = fd4.f18924a;
        return new jc2[]{fd4Var, fd4Var, c50.f15807c};
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        g24 g24Var = descriptor;
        ri0 ri0VarMo5382a = iv0Var.mo5382a(g24Var);
        boolean z = true;
        int i = 0;
        String strMo5395r = null;
        String strMo5395r2 = null;
        byte[] bArr = null;
        while (z) {
            int iMo6325j = ri0VarMo5382a.mo6325j(g24Var);
            if (iMo6325j == -1) {
                z = false;
            } else if (iMo6325j == 0) {
                strMo5395r = ri0VarMo5382a.mo5395r(g24Var, 0);
                i |= 1;
            } else if (iMo6325j == 1) {
                strMo5395r2 = ri0VarMo5382a.mo5395r(g24Var, 1);
                i |= 2;
            } else {
                if (iMo6325j != 2) {
                    throw new mu4(iMo6325j);
                }
                bArr = (byte[]) ri0VarMo5382a.mo5402y(g24Var, 2, c50.f15807c, bArr);
                i |= 4;
            }
        }
        ri0VarMo5382a.mo5398u(g24Var);
        if (7 != (i & 7)) {
            gq6.m6069G(i, 7, descriptor);
            throw null;
        }
        ea3 ea3Var = new ea3();
        ea3Var.f17927a = strMo5395r;
        ea3Var.f17928b = strMo5395r2;
        ea3Var.f17929c = bArr;
        return ea3Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        ea3 ea3Var = (ea3) obj;
        g24 g24Var = descriptor;
        si0 si0VarMo5918a = g81Var.mo5918a(g24Var);
        si0VarMo5918a.mo6730n(g24Var, 0, ea3Var.f17927a);
        si0VarMo5918a.mo6730n(g24Var, 1, ea3Var.f17928b);
        si0VarMo5918a.mo6734s(g24Var, 2, c50.f15807c, ea3Var.f17929c);
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return descriptor;
    }
}
