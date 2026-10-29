package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rj2 extends se0 {

    /* JADX INFO: renamed from: u */
    public mh3 f29353u;

    @Override // p000.se0
    /* JADX INFO: renamed from: A */
    public final Integer mo4966A() {
        return this.f29353u.f24922f;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        mh3 mh3Var = this.f29353u;
        String str = mh3Var.f24917a;
        j63 j63Var = mh3Var.f24921e;
        qj2 qj2Var = new qj2();
        qj2Var.f28524a = str;
        qj2Var.f28525b = j63Var;
        VarHandle.storeStoreFence();
        return qj2Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final u50 m10344k0() throws GeneralSecurityException {
        mh3 mh3Var = this.f29353u;
        j63 j63Var = mh3Var.f24921e;
        Integer num = mh3Var.f24922f;
        if (j63Var.equals(j63.f22047e)) {
            return u50.m11249b(new byte[0]);
        }
        if (j63Var.equals(j63.f22045c)) {
            return k63.m7411b(num.intValue());
        }
        if (j63Var.equals(j63.f22046d) || j63Var.equals(j63.f22048f)) {
            return k63.m7410a(num.intValue());
        }
        xy4.m12788q("Unknown output prefix type");
        return null;
    }
}
