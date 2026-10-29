package p000;

import ads_mobile_sdk.bi3;
import ads_mobile_sdk.sc3;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w55 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ bi3 f33115a;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        bi3 bi3Var = this.f33115a;
        int i = 0;
        bi3Var.f1179b.m2097a("reportBinderDeath", new Object[0]);
        if (bi3Var.f1187j.get() != null) {
            xy4.m12778e();
            return;
        }
        bi3Var.f1179b.m2097a("%s : Binder has died.", bi3Var.f1180c);
        ArrayList arrayList = bi3Var.f1181d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RemoteException remoteException = new RemoteException(zi4.m13623w(new StringBuilder(), bi3Var.f1180c, " : Binder has died."));
            li4 li4Var = ((sc3) obj).f11240a;
            if (li4Var != null) {
                li4Var.m7989b(remoteException);
            }
        }
        bi3Var.f1181d.clear();
        synchronized (bi3Var.f1183f) {
            try {
                Iterator it = bi3Var.f1182e.iterator();
                while (it.hasNext()) {
                    ((li4) it.next()).m7989b(new RemoteException(bi3Var.f1180c + " : Binder has died."));
                }
                bi3Var.f1182e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
