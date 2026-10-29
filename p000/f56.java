package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f56 extends kl5 implements s56 {
    public f56(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", (byte) 6);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: A */
    public final void mo5562A(yo5 yo5Var, cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, yo5Var);
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 12);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: B */
    public final void mo5563B(cp6 cp6Var, Bundle bundle, x56 x56Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        st5.m10913b(parcelM7550G, bundle);
        st5.m10914c(parcelM7550G, x56Var);
        m7553J(parcelM7550G, 31);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: C */
    public final void mo5564C(cp6 cp6Var, ll6 ll6Var, b66 b66Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        st5.m10913b(parcelM7550G, ll6Var);
        st5.m10914c(parcelM7550G, b66Var);
        m7553J(parcelM7550G, 29);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: D */
    public final String mo5565D(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        Parcel parcelM7549F = m7549F(parcelM7550G, 11);
        String string = parcelM7549F.readString();
        parcelM7549F.recycle();
        return string;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: b */
    public final List mo5566b(String str, String str2, String str3, boolean z) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(null);
        parcelM7550G.writeString(str2);
        parcelM7550G.writeString(str3);
        ClassLoader classLoader = st5.f30558a;
        parcelM7550G.writeInt(z ? 1 : 0);
        Parcel parcelM7549F = m7549F(parcelM7550G, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM7549F.createTypedArrayList(xm6.CREATOR);
        parcelM7549F.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: d */
    public final bq5 mo5567d(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        Parcel parcelM7549F = m7549F(parcelM7550G, 21);
        bq5 bq5Var = (bq5) st5.m10912a(parcelM7549F, bq5.CREATOR);
        parcelM7549F.recycle();
        return bq5Var;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: e */
    public final void mo5568e(Bundle bundle, cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, bundle);
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 19);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: f */
    public final void mo5569f(cp6 cp6Var, ko5 ko5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        st5.m10913b(parcelM7550G, ko5Var);
        m7553J(parcelM7550G, 30);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: g */
    public final void mo5570g(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 27);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: i */
    public final void mo5571i(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 18);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: k */
    public final void mo5572k(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 4);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: m */
    public final void mo5573m(long j, String str, String str2, String str3) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeLong(j);
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        parcelM7550G.writeString(str3);
        m7553J(parcelM7550G, 10);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: n */
    public final List mo5574n(String str, String str2, String str3) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(null);
        parcelM7550G.writeString(str2);
        parcelM7550G.writeString(str3);
        Parcel parcelM7549F = m7549F(parcelM7550G, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM7549F.createTypedArrayList(yo5.CREATOR);
        parcelM7549F.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: p */
    public final List mo5575p(String str, String str2, cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        st5.m10913b(parcelM7550G, cp6Var);
        Parcel parcelM7549F = m7549F(parcelM7550G, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM7549F.createTypedArrayList(yo5.CREATOR);
        parcelM7549F.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: q */
    public final void mo5576q(xm6 xm6Var, cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, xm6Var);
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 2);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: r */
    public final void mo5577r(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 25);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: u */
    public final void mo5578u(ys5 ys5Var, cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, ys5Var);
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 1);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: v */
    public final void mo5579v(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 20);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: w */
    public final List mo5580w(String str, String str2, boolean z, cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        ClassLoader classLoader = st5.f30558a;
        parcelM7550G.writeInt(z ? 1 : 0);
        st5.m10913b(parcelM7550G, cp6Var);
        Parcel parcelM7549F = m7549F(parcelM7550G, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM7549F.createTypedArrayList(xm6.CREATOR);
        parcelM7549F.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: x */
    public final void mo5581x(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 6);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: y */
    public final byte[] mo5582y(String str, ys5 ys5Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, ys5Var);
        parcelM7550G.writeString(str);
        Parcel parcelM7549F = m7549F(parcelM7550G, 9);
        byte[] bArrCreateByteArray = parcelM7549F.createByteArray();
        parcelM7549F.recycle();
        return bArrCreateByteArray;
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: z */
    public final void mo5583z(cp6 cp6Var) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, cp6Var);
        m7553J(parcelM7550G, 26);
    }
}
