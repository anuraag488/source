package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pz1 extends Binder implements qz1 {
    /* JADX INFO: renamed from: E */
    public static qz1 m9688E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(qz1.f28899gp);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof qz1)) {
            return (qz1) iInterfaceQueryLocalInterface;
        }
        oz1 oz1Var = new oz1();
        oz1Var.f27242a = iBinder;
        return oz1Var;
    }
}
