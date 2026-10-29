package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bx5 extends kl5 implements gx5 {
    @Override // p000.gx5
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 23);
    }

    @Override // p000.gx5
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        st5.m10913b(parcelM7550G, bundle);
        m7553J(parcelM7550G, 9);
    }

    @Override // p000.gx5
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 24);
    }

    @Override // p000.gx5
    public final void generateEventId(qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 22);
    }

    @Override // p000.gx5
    public final void getCachedAppInstanceId(qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 19);
    }

    @Override // p000.gx5
    public final void getConditionalUserProperties(String str, String str2, qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 10);
    }

    @Override // p000.gx5
    public final void getCurrentScreenClass(qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 17);
    }

    @Override // p000.gx5
    public final void getCurrentScreenName(qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 16);
    }

    @Override // p000.gx5
    public final void getGmpAppId(qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 21);
    }

    @Override // p000.gx5
    public final void getMaxUserProperties(String str, qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 6);
    }

    @Override // p000.gx5
    public final void getUserProperties(String str, String str2, boolean z, qx5 qx5Var) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        ClassLoader classLoader = st5.f30558a;
        parcelM7550G.writeInt(z ? 1 : 0);
        st5.m10914c(parcelM7550G, qx5Var);
        m7553J(parcelM7550G, 5);
    }

    @Override // p000.gx5
    public final void initialize(a02 a02Var, mz5 mz5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, a02Var);
        st5.m10913b(parcelM7550G, mz5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 1);
    }

    @Override // p000.gx5
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        st5.m10913b(parcelM7550G, bundle);
        parcelM7550G.writeInt(z ? 1 : 0);
        parcelM7550G.writeInt(z2 ? 1 : 0);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 2);
    }

    @Override // p000.gx5
    public final void logHealthData(int i, String str, a02 a02Var, a02 a02Var2, a02 a02Var3) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeInt(5);
        parcelM7550G.writeString("Error with data collection. Data lost.");
        st5.m10914c(parcelM7550G, a02Var);
        st5.m10914c(parcelM7550G, a02Var2);
        st5.m10914c(parcelM7550G, a02Var3);
        m7553J(parcelM7550G, 33);
    }

    @Override // p000.gx5
    public final void onActivityCreatedByScionActivityInfo(pz5 pz5Var, Bundle bundle, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        st5.m10913b(parcelM7550G, bundle);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 53);
    }

    @Override // p000.gx5
    public final void onActivityDestroyedByScionActivityInfo(pz5 pz5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 54);
    }

    @Override // p000.gx5
    public final void onActivityPausedByScionActivityInfo(pz5 pz5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 55);
    }

    @Override // p000.gx5
    public final void onActivityResumedByScionActivityInfo(pz5 pz5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 56);
    }

    @Override // p000.gx5
    public final void onActivitySaveInstanceStateByScionActivityInfo(pz5 pz5Var, qx5 qx5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        st5.m10914c(parcelM7550G, qx5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 57);
    }

    @Override // p000.gx5
    public final void onActivityStartedByScionActivityInfo(pz5 pz5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 51);
    }

    @Override // p000.gx5
    public final void onActivityStoppedByScionActivityInfo(pz5 pz5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 52);
    }

    @Override // p000.gx5
    public final void performAction(Bundle bundle, qx5 qx5Var, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, bundle);
        st5.m10914c(parcelM7550G, qx5Var);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 32);
    }

    @Override // p000.gx5
    public final void registerOnMeasurementEventListener(az5 az5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, az5Var);
        m7553J(parcelM7550G, 35);
    }

    @Override // p000.gx5
    public final void retrieveAndUploadBatches(dy5 dy5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, dy5Var);
        m7553J(parcelM7550G, 58);
    }

    @Override // p000.gx5
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, bundle);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 8);
    }

    @Override // p000.gx5
    public final void setCurrentScreenByScionActivityInfo(pz5 pz5Var, String str, String str2, long j) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, pz5Var);
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 50);
    }

    @Override // p000.gx5
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelM7550G = m7550G();
        ClassLoader classLoader = st5.f30558a;
        parcelM7550G.writeInt(z ? 1 : 0);
        m7553J(parcelM7550G, 39);
    }

    @Override // p000.gx5
    public final void setEventInterceptor(az5 az5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, az5Var);
        m7553J(parcelM7550G, 34);
    }

    @Override // p000.gx5
    public final void setUserProperty(String str, String str2, a02 a02Var, boolean z, long j) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        st5.m10914c(parcelM7550G, a02Var);
        parcelM7550G.writeInt(z ? 1 : 0);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 4);
    }

    @Override // p000.gx5
    public final void unregisterOnMeasurementEventListener(az5 az5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10914c(parcelM7550G, az5Var);
        m7553J(parcelM7550G, 36);
    }
}
