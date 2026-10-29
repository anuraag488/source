package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ty5 extends mh5 {

    /* JADX INFO: renamed from: j */
    public AbstractC1235ux f31550j;

    /* JADX INFO: renamed from: k */
    public int f31551k;

    @Override // p000.mh5
    /* JADX INFO: renamed from: G */
    public final boolean mo5640G(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.f31551k;
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) nv5.m8862a(parcel, Bundle.CREATOR);
            nv5.m8864c(parcel);
            y42.m12855b0(this.f31550j, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC1235ux abstractC1235ux = this.f31550j;
            abstractC1235ux.getClass();
            p36 p36Var = new p36(abstractC1235ux, i3, strongBinder, bundle);
            ur5 ur5Var = abstractC1235ux.zzb;
            ur5Var.sendMessage(ur5Var.obtainMessage(1, i2, -1, p36Var));
            this.f31550j = null;
        } else if (i == 2) {
            parcel.readInt();
            nv5.m8864c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            cc6 cc6Var = (cc6) nv5.m8862a(parcel, cc6.CREATOR);
            nv5.m8864c(parcel);
            AbstractC1235ux abstractC1235ux2 = this.f31550j;
            y42.m12855b0(abstractC1235ux2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y42.m12854a0(cc6Var);
            abstractC1235ux2.zzc(cc6Var);
            Bundle bundle2 = cc6Var.f15932d;
            y42.m12855b0(this.f31550j, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC1235ux abstractC1235ux3 = this.f31550j;
            abstractC1235ux3.getClass();
            p36 p36Var2 = new p36(abstractC1235ux3, i4, strongBinder2, bundle2);
            ur5 ur5Var2 = abstractC1235ux3.zzb;
            ur5Var2.sendMessage(ur5Var2.obtainMessage(1, i2, -1, p36Var2));
            this.f31550j = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
