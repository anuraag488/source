package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class es5 implements ns5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18440a;

    /* JADX INFO: renamed from: b */
    public final r36 f18441b;

    /* JADX INFO: renamed from: c */
    public final String f18442c;

    public /* synthetic */ es5(r36 r36Var, String str, byte b) {
        this.f18440a = b;
        this.f18441b = r36Var;
        this.f18442c = str;
    }

    @Override // p000.ns5
    /* JADX INFO: renamed from: g */
    public final r36 mo5322g(aq5 aq5Var) {
        byte b = this.f18440a;
        String str = this.f18442c;
        r36 r36Var = this.f18441b;
        switch (b) {
            case 0:
                r36 r36VarM10196g = r36Var.m10196g();
                r36VarM10196g.m10199k(str, aq5Var);
                ((HashMap) r36VarM10196g.f28988d).put(str, Boolean.TRUE);
                return r36VarM10196g;
            default:
                r36Var.m10199k(str, aq5Var);
                return r36Var;
        }
    }
}
