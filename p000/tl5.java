package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tl5 {

    /* JADX INFO: renamed from: a */
    public final byte f31230a;

    /* JADX WARN: Multi-variable type inference failed */
    public tl5(int i) {
        this.f31230a = i;
    }

    /* JADX INFO: renamed from: g */
    public static Status m11060g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo4556a(ol5 ol5Var);

    /* JADX INFO: renamed from: b */
    public abstract ed1[] mo4557b(ol5 ol5Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo4558c(Status status);

    /* JADX INFO: renamed from: d */
    public abstract void mo4559d(Exception exc);

    /* JADX INFO: renamed from: e */
    public abstract void mo4560e(ol5 ol5Var);

    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo4561f(pq3 pq3Var, boolean z) {
    }
}
