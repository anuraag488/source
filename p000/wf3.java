package p000;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wf3 {

    /* JADX INFO: renamed from: a */
    public HashMap f33337a;

    /* JADX INFO: renamed from: b */
    public HashMap f33338b;

    /* JADX INFO: renamed from: a */
    public final Object m12300a(se0 se0Var, Class cls) throws GeneralSecurityException {
        vf3 vf3Var = new vf3(se0Var.getClass(), cls);
        HashMap map = this.f33337a;
        if (map.containsKey(vf3Var)) {
            return ((rf3) map.get(vf3Var)).f29226c.mo4670b(se0Var);
        }
        xy4.m12793v("No PrimitiveConstructor for ", vf3Var, " available, see https://developers.google.com/tink/faq/registration_errors");
        return null;
    }
}
