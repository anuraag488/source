package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dm5 extends tl5 {

    /* JADX INFO: renamed from: b */
    public ki4 f17193b;

    /* JADX INFO: renamed from: c */
    public li4 f17194c;

    /* JADX INFO: renamed from: d */
    public ig1 f17195d;

    @Override // p000.tl5
    /* JADX INFO: renamed from: a */
    public final boolean mo4556a(ol5 ol5Var) {
        return this.f17193b.f23156b;
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: b */
    public final ed1[] mo4557b(ol5 ol5Var) {
        return this.f17193b.f23155a;
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: c */
    public final void mo4558c(Status status) {
        ig1 ig1Var = this.f17195d;
        li4 li4Var = this.f17194c;
        ig1Var.getClass();
        li4Var.m7989b(status.f16230f != null ? new mo3(status) : new C1334xk(status));
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: d */
    public final void mo4559d(Exception exc) {
        this.f17194c.m7989b(exc);
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: e */
    public final void mo4560e(ol5 ol5Var) throws DeadObjectException {
        li4 li4Var = this.f17194c;
        try {
            ki4 ki4Var = this.f17193b;
            ((sm3) ((ki4) ki4Var.f23158d).f23158d).accept(ol5Var.f26857b, li4Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo4558c(tl5.m11060g(e2));
        } catch (RuntimeException e3) {
            li4Var.m7989b(e3);
        }
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: f */
    public final void mo4561f(pq3 pq3Var, boolean z) {
        li4 li4Var = this.f17194c;
        ((Map) pq3Var.f27897c).put(li4Var, Boolean.valueOf(z));
        nr6 nr6Var = li4Var.f24059a;
        yg3 yg3Var = new yg3((byte) 10);
        yg3Var.f35216c = pq3Var;
        yg3Var.f35215b = li4Var;
        VarHandle.storeStoreFence();
        nr6Var.m8818b(yg3Var);
    }
}
