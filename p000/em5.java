package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class em5 extends tl5 {

    /* JADX INFO: renamed from: b */
    public li4 f18263b;

    /* JADX INFO: renamed from: c */
    public gm2 f18264c;

    @Override // p000.tl5
    /* JADX INFO: renamed from: a */
    public final boolean mo4556a(ol5 ol5Var) {
        if (ol5Var.f26861f.get(this.f18264c) == null) {
            return false;
        }
        xy4.m12778e();
        return false;
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: b */
    public final ed1[] mo4557b(ol5 ol5Var) {
        if (ol5Var.f26861f.get(this.f18264c) == null) {
            return null;
        }
        xy4.m12778e();
        return null;
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: c */
    public final void mo4558c(Status status) {
        this.f18263b.m7989b(new C1334xk(status));
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: d */
    public final void mo4559d(Exception exc) {
        this.f18263b.m7989b(exc);
    }

    @Override // p000.tl5
    /* JADX INFO: renamed from: e */
    public final void mo4560e(ol5 ol5Var) throws DeadObjectException {
        try {
            m5205h(ol5Var);
        } catch (DeadObjectException e) {
            mo4558c(tl5.m11060g(e));
            throw e;
        } catch (RemoteException e2) {
            mo4558c(tl5.m11060g(e2));
        } catch (RuntimeException e3) {
            this.f18263b.m7989b(e3);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5205h(ol5 ol5Var) {
        if (ol5Var.f26861f.remove(this.f18264c) == null) {
            this.f18263b.m7990c(Boolean.FALSE);
        } else {
            xy4.m12778e();
        }
    }
}
