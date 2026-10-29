package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jc6 extends pt5 implements s56 {

    /* JADX INFO: renamed from: a */
    public qm6 f22167a;

    /* JADX INFO: renamed from: b */
    public Boolean f22168b;

    /* JADX INFO: renamed from: c */
    public String f22169c;

    @Override // p000.s56
    /* JADX INFO: renamed from: A */
    public final void mo5562A(yo5 yo5Var, cp6 cp6Var) {
        y42.m12854a0(yo5Var);
        y42.m12854a0(yo5Var.f35434f);
        m7064G(cp6Var);
        yo5 yo5Var2 = new yo5(yo5Var);
        yo5Var2.f35432d = cp6Var.f16349d;
        yn3 yn3Var = new yn3((byte) 14);
        yn3Var.f35360b = yo5Var2;
        yn3Var.f35361c = cp6Var;
        yn3Var.f35362d = this;
        VarHandle.storeStoreFence();
        m7066I(yn3Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: B */
    public final void mo5563B(cp6 cp6Var, Bundle bundle, x56 x56Var) {
        m7064G(cp6Var);
        String str = cp6Var.f16349d;
        y42.m12854a0(str);
        ea6 ea6VarMo9020c = this.f22167a.mo9020c();
        wb6 wb6Var = new wb6((byte) 0);
        wb6Var.f33226d = this;
        wb6Var.f33225c = cp6Var;
        wb6Var.f33227e = bundle;
        wb6Var.f33228f = x56Var;
        wb6Var.f33224b = str;
        VarHandle.storeStoreFence();
        ea6VarMo9020c.m5033D(wb6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: C */
    public final void mo5564C(cp6 cp6Var, ll6 ll6Var, b66 b66Var) {
        m7064G(cp6Var);
        String str = cp6Var.f16349d;
        y42.m12854a0(str);
        ea6 ea6VarMo9020c = this.f22167a.mo9020c();
        yb6 yb6Var = new yb6((byte) 0);
        yb6Var.f35105c = this;
        yb6Var.f35104b = str;
        yb6Var.f35106d = ll6Var;
        yb6Var.f35107e = b66Var;
        VarHandle.storeStoreFence();
        ea6VarMo9020c.m5033D(yb6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: D */
    public final String mo5565D(cp6 cp6Var) {
        m7064G(cp6Var);
        qm6 qm6Var = this.f22167a;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        sa6 sa6Var = new sa6((byte) 2);
        sa6Var.f30043c = cp6Var;
        sa6Var.f30042b = qm6Var;
        VarHandle.storeStoreFence();
        try {
            return (String) ea6VarMo9020c.m5031B(sa6Var).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            qm6Var.mo9019b().f16835j.m12506c("Failed to get app instance id. appId", d76.m4401y(cp6Var.f16349d), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        qm6 qm6Var = this.f22167a;
        ArrayList arrayList = null;
        x56 t56Var = null;
        b66 y56Var = null;
        switch (i) {
            case 1:
                ys5 ys5Var = (ys5) st5.m10912a(parcel, ys5.CREATOR);
                cp6 cp6Var = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5578u(ys5Var, cp6Var);
                parcel2.writeNoException();
                return true;
            case 2:
                xm6 xm6Var = (xm6) st5.m10912a(parcel, xm6.CREATOR);
                cp6 cp6Var2 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5576q(xm6Var, cp6Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                cp6 cp6Var3 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5572k(cp6Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                ys5 ys5Var2 = (ys5) st5.m10912a(parcel, ys5.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                st5.m10915d(parcel);
                y42.m12854a0(ys5Var2);
                y42.m12851X(string);
                m7065H(string, true);
                yn3 yn3Var = new yn3((byte) 16);
                yn3Var.f35360b = ys5Var2;
                yn3Var.f35361c = string;
                yn3Var.f35362d = this;
                VarHandle.storeStoreFence();
                m7066I(yn3Var);
                parcel2.writeNoException();
                return true;
            case 6:
                cp6 cp6Var4 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5581x(cp6Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                cp6 cp6Var5 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                byte b = parcel.readInt() != 0;
                st5.m10915d(parcel);
                m7064G(cp6Var5);
                String str = cp6Var5.f16349d;
                y42.m12854a0(str);
                ea6 ea6VarMo9020c = qm6Var.mo9020c();
                sa6 sa6Var = new sa6((byte) 0);
                sa6Var.f30043c = str;
                sa6Var.f30042b = this;
                VarHandle.storeStoreFence();
                try {
                    List<an6> list2 = (List) ea6VarMo9020c.m5031B(sa6Var).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (an6 an6Var : list2) {
                        if (b != false || !dn6.m4569S(an6Var.f14647c)) {
                            arrayList2.add(new xm6(an6Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    qm6Var.mo9019b().f16835j.m12506c("Failed to get user properties. appId", d76.m4401y(str), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                ys5 ys5Var3 = (ys5) st5.m10912a(parcel, ys5.CREATOR);
                String string2 = parcel.readString();
                st5.m10915d(parcel);
                byte[] bArrMo5582y = mo5582y(string2, ys5Var3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo5582y);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                st5.m10915d(parcel);
                mo5573m(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                cp6 cp6Var6 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                String strMo5565D = mo5565D(cp6Var6);
                parcel2.writeNoException();
                parcel2.writeString(strMo5565D);
                return true;
            case 12:
                yo5 yo5Var = (yo5) st5.m10912a(parcel, yo5.CREATOR);
                cp6 cp6Var7 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5562A(yo5Var, cp6Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                yo5 yo5Var2 = (yo5) st5.m10912a(parcel, yo5.CREATOR);
                st5.m10915d(parcel);
                y42.m12854a0(yo5Var2);
                y42.m12854a0(yo5Var2.f35434f);
                y42.m12851X(yo5Var2.f35432d);
                m7065H(yo5Var2.f35432d, true);
                yo5 yo5Var3 = new yo5(yo5Var2);
                ar1 ar1Var = new ar1((byte) 20);
                ar1Var.f14798b = yo5Var3;
                ar1Var.f14799c = this;
                VarHandle.storeStoreFence();
                m7066I(ar1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = st5.f30558a;
                z = parcel.readInt() != 0;
                cp6 cp6Var8 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                List listMo5580w = mo5580w(string6, string7, z, cp6Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5580w);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = st5.f30558a;
                z = parcel.readInt() != 0;
                st5.m10915d(parcel);
                List listMo5566b = mo5566b(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5566b);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                cp6 cp6Var9 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                List listMo5575p = mo5575p(string11, string12, cp6Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5575p);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                st5.m10915d(parcel);
                List listMo5574n = mo5574n(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5574n);
                return true;
            case 18:
                cp6 cp6Var10 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5571i(cp6Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                cp6 cp6Var11 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5568e(bundle, cp6Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                cp6 cp6Var12 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5579v(cp6Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                cp6 cp6Var13 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                bq5 bq5VarMo5567d = mo5567d(cp6Var13);
                parcel2.writeNoException();
                if (bq5VarMo5567d == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bq5VarMo5567d.writeToParcel(parcel2, 1);
                return true;
            case 24:
                cp6 cp6Var14 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                Bundle bundle2 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                st5.m10915d(parcel);
                m7064G(cp6Var14);
                String str2 = cp6Var14.f16349d;
                y42.m12854a0(str2);
                if (!qm6Var.m9950d0().m9225E(null, e56.f17766Y0)) {
                    ea6 ea6VarMo9020c2 = qm6Var.mo9020c();
                    rb6 rb6Var = new rb6((byte) 1);
                    rb6Var.f29141b = cp6Var14;
                    rb6Var.f29142c = bundle2;
                    rb6Var.f29143d = this;
                    VarHandle.storeStoreFence();
                    try {
                        list = (List) ea6VarMo9020c2.m5031B(rb6Var).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        qm6Var.mo9019b().f16835j.m12506c("Failed to get trigger URIs. appId", d76.m4401y(str2), e2);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    ea6 ea6VarMo9020c3 = qm6Var.mo9020c();
                    rb6 rb6Var2 = new rb6((byte) 0);
                    rb6Var2.f29141b = cp6Var14;
                    rb6Var2.f29142c = bundle2;
                    rb6Var2.f29143d = this;
                    VarHandle.storeStoreFence();
                    try {
                        list = (List) ea6VarMo9020c3.m5032C(rb6Var2).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        qm6Var.mo9019b().f16835j.m12506c("Failed to get trigger URIs. appId", d76.m4401y(str2), e3);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                cp6 cp6Var15 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5577r(cp6Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                cp6 cp6Var16 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5583z(cp6Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                cp6 cp6Var17 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                st5.m10915d(parcel);
                mo5570g(cp6Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                cp6 cp6Var18 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                ll6 ll6Var = (ll6) st5.m10912a(parcel, ll6.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    y56Var = iInterfaceQueryLocalInterface instanceof b66 ? (b66) iInterfaceQueryLocalInterface : new y56(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", (byte) 6);
                }
                st5.m10915d(parcel);
                mo5564C(cp6Var18, ll6Var, y56Var);
                parcel2.writeNoException();
                return true;
            case 30:
                cp6 cp6Var19 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                ko5 ko5Var = (ko5) st5.m10912a(parcel, ko5.CREATOR);
                st5.m10915d(parcel);
                mo5569f(cp6Var19, ko5Var);
                parcel2.writeNoException();
                return true;
            case 31:
                cp6 cp6Var20 = (cp6) st5.m10912a(parcel, cp6.CREATOR);
                Bundle bundle3 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    t56Var = iInterfaceQueryLocalInterface2 instanceof x56 ? (x56) iInterfaceQueryLocalInterface2 : new t56(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", (byte) 6);
                }
                st5.m10915d(parcel);
                mo5563B(cp6Var20, bundle3, t56Var);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m7063F(Runnable runnable) {
        qm6 qm6Var = this.f22167a;
        if (qm6Var.mo9020c().m5030A()) {
            runnable.run();
        } else {
            qm6Var.mo9020c().m5035F(runnable);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m7064G(cp6 cp6Var) {
        y42.m12854a0(cp6Var);
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        m7065H(str, false);
        this.f22167a.m9960j0().m4620y(cp6Var.f16350e);
    }

    /* JADX INFO: renamed from: H */
    public final void m7065H(String str, boolean z) {
        qm6 qm6Var = this.f22167a;
        if (TextUtils.isEmpty(str)) {
            qm6Var.mo9019b().f16835j.m12504a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean boolValueOf = this.f22168b;
                if (boolValueOf == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f22169c) && !sj3.m10827w(qm6Var.f28602l.f26509a, Binder.getCallingUid()) && !zt1.m13748a(qm6Var.f28602l.f26509a).m13751b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                    this.f22168b = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f22169c == null) {
            Context context = qm6Var.f28602l.f26509a;
            int callingUid = Binder.getCallingUid();
            int i = yt1.f35521e;
            if (sj3.m10801J(context, callingUid, str)) {
                this.f22169c = str;
            }
        }
        if (str.equals(this.f22169c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* JADX INFO: renamed from: I */
    public final void m7066I(Runnable runnable) {
        qm6 qm6Var = this.f22167a;
        if (qm6Var.mo9020c().m5030A()) {
            runnable.run();
        } else {
            qm6Var.mo9020c().m5033D(runnable);
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: b */
    public final List mo5566b(String str, String str2, String str3, boolean z) {
        m7065H(str, true);
        qm6 qm6Var = this.f22167a;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        db6 db6Var = new db6((byte) 1);
        db6Var.f16908b = str;
        db6Var.f16909c = str2;
        db6Var.f16910d = str3;
        db6Var.f16911e = this;
        VarHandle.storeStoreFence();
        try {
            List<an6> list = (List) ea6VarMo9020c.m5031B(db6Var).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (an6 an6Var : list) {
                if (z || !dn6.m4569S(an6Var.f14647c)) {
                    arrayList.add(new xm6(an6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            qm6Var.mo9019b().f16835j.m12506c("Failed to get user properties as. appId", d76.m4401y(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: d */
    public final bq5 mo5567d(cp6 cp6Var) {
        m7064G(cp6Var);
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        qm6 qm6Var = this.f22167a;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        sa6 sa6Var = new sa6((byte) 1);
        sa6Var.f30043c = cp6Var;
        sa6Var.f30042b = this;
        VarHandle.storeStoreFence();
        try {
            return (bq5) ea6VarMo9020c.m5032C(sa6Var).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            qm6Var.mo9019b().f16835j.m12506c("Failed to get consent. appId", d76.m4401y(str), e);
            return new bq5(null);
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: e */
    public final void mo5568e(Bundle bundle, cp6 cp6Var) {
        m7064G(cp6Var);
        String str = cp6Var.f16349d;
        y42.m12854a0(str);
        yb6 yb6Var = new yb6((byte) 2);
        yb6Var.f35105c = this;
        yb6Var.f35106d = bundle;
        yb6Var.f35104b = str;
        yb6Var.f35107e = cp6Var;
        VarHandle.storeStoreFence();
        m7066I(yb6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: f */
    public final void mo5569f(cp6 cp6Var, ko5 ko5Var) {
        m7064G(cp6Var);
        yn3 yn3Var = new yn3((byte) 18);
        yn3Var.f35360b = this;
        yn3Var.f35361c = cp6Var;
        yn3Var.f35362d = ko5Var;
        VarHandle.storeStoreFence();
        m7066I(yn3Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: g */
    public final void mo5570g(cp6 cp6Var) {
        m7064G(cp6Var);
        xa6 xa6Var = new xa6((byte) 0);
        xa6Var.f34120b = cp6Var;
        xa6Var.f34121c = this;
        VarHandle.storeStoreFence();
        m7066I(xa6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: i */
    public final void mo5571i(cp6 cp6Var) {
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        m7065H(str, false);
        va6 va6Var = new va6((byte) 1);
        va6Var.f32499b = cp6Var;
        va6Var.f32500c = this;
        VarHandle.storeStoreFence();
        m7066I(va6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: k */
    public final void mo5572k(cp6 cp6Var) {
        m7064G(cp6Var);
        va6 va6Var = new va6((byte) 0);
        va6Var.f32499b = cp6Var;
        va6Var.f32500c = this;
        VarHandle.storeStoreFence();
        m7066I(va6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: m */
    public final void mo5573m(long j, String str, String str2, String str3) {
        ya6 ya6Var = new ya6((byte) 0);
        ya6Var.f35075b = str2;
        ya6Var.f35076c = str3;
        ya6Var.f35078e = str;
        ya6Var.f35077d = j;
        ya6Var.f35079f = this;
        VarHandle.storeStoreFence();
        m7066I(ya6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: n */
    public final List mo5574n(String str, String str2, String str3) {
        m7065H(str, true);
        qm6 qm6Var = this.f22167a;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        db6 db6Var = new db6((byte) 3);
        db6Var.f16908b = str;
        db6Var.f16909c = str2;
        db6Var.f16910d = str3;
        db6Var.f16911e = this;
        VarHandle.storeStoreFence();
        try {
            return (List) ea6VarMo9020c.m5031B(db6Var).get();
        } catch (InterruptedException | ExecutionException e) {
            qm6Var.mo9019b().f16835j.m12505b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: p */
    public final List mo5575p(String str, String str2, cp6 cp6Var) {
        m7064G(cp6Var);
        String str3 = cp6Var.f16349d;
        y42.m12854a0(str3);
        qm6 qm6Var = this.f22167a;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        db6 db6Var = new db6((byte) 2);
        db6Var.f16908b = str3;
        db6Var.f16909c = str;
        db6Var.f16910d = str2;
        db6Var.f16911e = this;
        VarHandle.storeStoreFence();
        try {
            return (List) ea6VarMo9020c.m5031B(db6Var).get();
        } catch (InterruptedException | ExecutionException e) {
            qm6Var.mo9019b().f16835j.m12505b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: q */
    public final void mo5576q(xm6 xm6Var, cp6 cp6Var) {
        y42.m12854a0(xm6Var);
        m7064G(cp6Var);
        yn3 yn3Var = new yn3((byte) 17);
        yn3Var.f35360b = xm6Var;
        yn3Var.f35361c = cp6Var;
        yn3Var.f35362d = this;
        VarHandle.storeStoreFence();
        m7066I(yn3Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: r */
    public final void mo5577r(cp6 cp6Var) {
        y42.m12851X(cp6Var.f16349d);
        y42.m12854a0(cp6Var.f16367v);
        va6 va6Var = new va6((byte) 3);
        va6Var.f32500c = this;
        va6Var.f32499b = cp6Var;
        VarHandle.storeStoreFence();
        m7063F(va6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: u */
    public final void mo5578u(ys5 ys5Var, cp6 cp6Var) {
        y42.m12854a0(ys5Var);
        m7064G(cp6Var);
        yn3 yn3Var = new yn3((byte) 15);
        yn3Var.f35360b = ys5Var;
        yn3Var.f35361c = cp6Var;
        yn3Var.f35362d = this;
        VarHandle.storeStoreFence();
        m7066I(yn3Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: v */
    public final void mo5579v(cp6 cp6Var) {
        y42.m12851X(cp6Var.f16349d);
        y42.m12854a0(cp6Var.f16367v);
        xa6 xa6Var = new xa6((byte) 2);
        xa6Var.f34120b = cp6Var;
        xa6Var.f34121c = this;
        VarHandle.storeStoreFence();
        m7063F(xa6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: w */
    public final List mo5580w(String str, String str2, boolean z, cp6 cp6Var) {
        m7064G(cp6Var);
        String str3 = cp6Var.f16349d;
        y42.m12854a0(str3);
        qm6 qm6Var = this.f22167a;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        db6 db6Var = new db6((byte) 0);
        db6Var.f16908b = str3;
        db6Var.f16909c = str;
        db6Var.f16910d = str2;
        db6Var.f16911e = this;
        VarHandle.storeStoreFence();
        try {
            List<an6> list = (List) ea6VarMo9020c.m5031B(db6Var).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (an6 an6Var : list) {
                if (z || !dn6.m4569S(an6Var.f14647c)) {
                    arrayList.add(new xm6(an6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            qm6Var.mo9019b().f16835j.m12506c("Failed to query user properties. appId", d76.m4401y(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: x */
    public final void mo5581x(cp6 cp6Var) {
        m7064G(cp6Var);
        xa6 xa6Var = new xa6((byte) 1);
        xa6Var.f34120b = cp6Var;
        xa6Var.f34121c = this;
        VarHandle.storeStoreFence();
        m7066I(xa6Var);
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: y */
    public final byte[] mo5582y(String str, ys5 ys5Var) {
        y42.m12851X(str);
        y42.m12854a0(ys5Var);
        m7065H(str, true);
        qm6 qm6Var = this.f22167a;
        x66 x66Var = qm6Var.mo9019b().f16842q;
        oa6 oa6Var = qm6Var.f28602l;
        p66 p66Var = oa6Var.f26518j;
        String str2 = ys5Var.f35504d;
        x66Var.m12505b(p66Var.m9366a(str2), "Log and bundle. event");
        qm6Var.mo9022e().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        tu5 tu5Var = new tu5((byte) 2);
        tu5Var.f31462b = this;
        VarHandle.storeStoreFence();
        try {
            byte[] bArr = (byte[]) ea6VarMo9020c.m5032C(tu5Var).get();
            if (bArr == null) {
                qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            qm6Var.mo9022e().getClass();
            qm6Var.mo9019b().f16842q.m12507d("Log and bundle processed. event, size, time_ms", oa6Var.f26518j.m9366a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            qm6Var.mo9019b().f16835j.m12507d("Failed to log and bundle. appId, event, error", d76.m4401y(str), oa6Var.f26518j.m9366a(str2), e);
            return null;
        }
    }

    @Override // p000.s56
    /* JADX INFO: renamed from: z */
    public final void mo5583z(cp6 cp6Var) {
        y42.m12851X(cp6Var.f16349d);
        y42.m12854a0(cp6Var.f16367v);
        va6 va6Var = new va6((byte) 2);
        va6Var.f32500c = this;
        va6Var.f32499b = cp6Var;
        VarHandle.storeStoreFence();
        m7063F(va6Var);
    }
}
