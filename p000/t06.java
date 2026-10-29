package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t06 extends us1 {

    /* JADX INFO: renamed from: c */
    public x64 f30712c;

    /* JADX INFO: renamed from: d */
    public x64 f30713d;

    /* JADX INFO: renamed from: e */
    public x64 f30714e;

    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x000e, B:7:0x0013, B:11:0x0019, B:13:0x0026, B:16:0x002d, B:18:0x0030, B:21:0x003e, B:24:0x0044, B:26:0x004e, B:29:0x00c4, B:27:0x0097, B:28:0x00bf), top: B:33:0x0003 }] */
    /* JADX INFO: renamed from: c */
    public final void m10958c(gm2 gm2Var, boolean z, li4 li4Var) {
        synchronized (this.f30713d) {
            try {
                m06 m06Var = (m06) this.f30713d.remove(gm2Var);
                if (m06Var == null) {
                    li4Var.m7988a(Boolean.FALSE);
                    return;
                }
                hm2 hm2Var = (hm2) m06Var.f24523j.f27896b;
                ed1 ed1Var = null;
                hm2Var.f20697a = null;
                hm2Var.f20698b = null;
                if (z) {
                    ed1[] availableFeatures = getAvailableFeatures();
                    if (availableFeatures != null) {
                        for (ed1 ed1Var2 : availableFeatures) {
                            if ("location_updates_with_callback".equals(ed1Var2.f18013d)) {
                                ed1Var = ed1Var2;
                                break;
                            }
                        }
                        if (ed1Var != null && ed1Var.m5091b() >= 1) {
                            fr6 fr6Var = (fr6) getService();
                            int iIdentityHashCode = System.identityHashCode(m06Var);
                            StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                            sb.append("ILocationCallback@");
                            sb.append(iIdentityHashCode);
                            l16 l16Var = new l16(2, null, m06Var, null, sb.toString());
                            uz5 uz5Var = new uz5(Boolean.TRUE, li4Var);
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.writeInterfaceToken(fr6Var.f23221c);
                            ov5.m9314b(parcelObtain, l16Var);
                            parcelObtain.writeStrongBinder(uz5Var);
                            fr6Var.m7553J(parcelObtain, 89);
                        } else {
                            fr6 fr6Var2 = (fr6) getService();
                            q16 q16Var = new q16(2, null, null, m06Var, null, new c06(li4Var), null);
                            Parcel parcelObtain2 = Parcel.obtain();
                            parcelObtain2.writeInterfaceToken(fr6Var2.f23221c);
                            ov5.m9314b(parcelObtain2, q16Var);
                            fr6Var2.m7553J(parcelObtain2, 59);
                        }
                    } else {
                        fr6 fr6Var3 = (fr6) getService();
                        q16 q16Var2 = new q16(2, null, null, m06Var, null, new c06(li4Var), null);
                        Parcel parcelObtain3 = Parcel.obtain();
                        parcelObtain3.writeInterfaceToken(fr6Var3.f23221c);
                        ov5.m9314b(parcelObtain3, q16Var2);
                        fr6Var3.m7553J(parcelObtain3, 59);
                    }
                } else {
                    li4Var.m7988a(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1235ux
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof fr6 ? (fr6) iInterfaceQueryLocalInterface : new fr6(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", (byte) 3);
    }

    @Override // p000.AbstractC1235ux
    public final ed1[] getApiFeatures() {
        return AbstractC0647fd.f18915e;
    }

    @Override // p000.AbstractC1235ux
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // p000.AbstractC1235ux
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // p000.AbstractC1235ux
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // p000.AbstractC1235ux
    public final void onConnectionSuspended() {
        System.currentTimeMillis();
        synchronized (this.f30712c) {
            this.f30712c.clear();
        }
        synchronized (this.f30713d) {
            this.f30713d.clear();
        }
        synchronized (this.f30714e) {
            this.f30714e.clear();
        }
    }

    @Override // p000.AbstractC1235ux
    public final boolean usesClientTelemetry() {
        return true;
    }
}
