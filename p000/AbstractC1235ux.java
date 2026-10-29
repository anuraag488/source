package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ux */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235ux {
    private static final ed1[] zze = new ed1[0];
    private volatile String zzA;
    private lk0 zzC;
    private boolean zzD;
    private volatile cc6 zzE;
    uq3 zza;
    final ur5 zzb;
    protected InterfaceC1198tx zzc;
    protected final AtomicInteger zzd;
    private volatile String zzk;
    private final Context zzl;
    private final tn6 zzn;
    private final qt1 zzo;
    private final Object zzp;
    private final Object zzq;
    private kn5 zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private a16 zzu;
    private byte zzv;
    private final InterfaceC1124rx zzw;
    private final InterfaceC1161sx zzx;
    private final short zzy;
    private final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1235ux(Context context, Looper looper, tn6 tn6Var, qt1 qt1Var, int i, InterfaceC1124rx interfaceC1124rx, InterfaceC1161sx interfaceC1161sx, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = (byte) 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        y42.m12855b0(context, "Context must not be null");
        this.zzl = context;
        y42.m12855b0(looper, "Looper must not be null");
        y42.m12855b0(tn6Var, "Supervisor must not be null");
        this.zzn = tn6Var;
        y42.m12855b0(qt1Var, "API availability must not be null");
        this.zzo = qt1Var;
        this.zzb = new ur5(this, looper);
        this.zzy = i;
        this.zzw = interfaceC1124rx;
        this.zzx = interfaceC1161sx;
        this.zzz = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m11676b(int i, IInterface iInterface) {
        uq3 uq3Var;
        y42.m12849V((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    a16 a16Var = this.zzu;
                    if (a16Var != null) {
                        tn6 tn6Var = this.zzn;
                        String str = this.zza.f32103a;
                        y42.m12854a0(str);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        tn6Var.m11076c(str, a16Var, this.zza.f32104b);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    a16 a16Var2 = this.zzu;
                    if (a16Var2 != null && (uq3Var = this.zza) != null) {
                        String str2 = uq3Var.f32103a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        tn6 tn6Var2 = this.zzn;
                        String str3 = this.zza.f32103a;
                        y42.m12854a0(str3);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        tn6Var2.m11076c(str3, a16Var2, this.zza.f32104b);
                        this.zzd.incrementAndGet();
                    }
                    int i2 = this.zzd.get();
                    a16 a16Var3 = new a16();
                    a16Var3.f57b = this;
                    a16Var3.f56a = i2;
                    VarHandle.storeStoreFence();
                    this.zzu = a16Var3;
                    String startServiceAction = getStartServiceAction();
                    boolean useDynamicLookup = getUseDynamicLookup();
                    uq3 uq3Var2 = new uq3();
                    uq3Var2.f32103a = startServiceAction;
                    uq3Var2.f32104b = useDynamicLookup;
                    VarHandle.storeStoreFence();
                    this.zza = uq3Var2;
                    if (useDynamicLookup && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f32103a)));
                    }
                    tn6 tn6Var3 = this.zzn;
                    String str4 = this.zza.f32103a;
                    y42.m12854a0(str4);
                    this.zza.getClass();
                    String name = this.zzz;
                    if (name == null) {
                        name = this.zzl.getClass().getName();
                    }
                    lk0 lk0VarM11075b = tn6Var3.m11075b(new bj6(str4, this.zza.f32104b), a16Var3, name, null);
                    if (!(lk0VarM11075b.f24097e == 0)) {
                        String str5 = this.zza.f32103a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i3 = lk0VarM11075b.f24097e;
                        if (i3 == -1) {
                            i3 = 16;
                        }
                        if (lk0VarM11075b.f24098f != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", lk0VarM11075b.f24098f);
                        }
                        int i4 = this.zzd.get();
                        l56 l56Var = new l56(this, i3, bundle);
                        ur5 ur5Var = this.zzb;
                        ur5Var.sendMessage(ur5Var.obtainMessage(7, i4, -1, l56Var));
                    }
                } else if (i == 4) {
                    y42.m12854a0(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void checkAvailabilityAndConnect() {
        int iM10123b = this.zzo.m10123b(this.zzl, getMinApkVersion());
        if (iM10123b == 0) {
            js1 js1Var = new js1();
            js1Var.f22555a = this;
            connect(js1Var);
            return;
        }
        m11676b(1, null);
        js1 js1Var2 = new js1();
        js1Var2.f22555a = this;
        this.zzc = js1Var2;
        int i = this.zzd.get();
        ur5 ur5Var = this.zzb;
        ur5Var.sendMessage(ur5Var.obtainMessage(3, i, iM10123b, null));
    }

    public final void connect(InterfaceC1198tx interfaceC1198tx) {
        this.zzc = interfaceC1198tx;
        m11676b(2, null);
    }

    public IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof bm5 ? (bm5) iInterfaceQueryLocalInterface : new bm5(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 0);
    }

    public final void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bn5 bn5Var = (bn5) arrayList.get(i);
                    synchronized (bn5Var) {
                        bn5Var.f15440a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        m11676b(1, null);
    }

    public Account getAccount() {
        return null;
    }

    public ed1[] getApiFeatures() {
        return zze;
    }

    public final ed1[] getAvailableFeatures() {
        cc6 cc6Var = this.zzE;
        if (cc6Var == null) {
            return null;
        }
        return cc6Var.f15933e;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public final void getEndpointPackageName() {
        if (!isConnected() || this.zza == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public final String getLastDisconnectMessage() {
        return this.zzk;
    }

    public int getMinApkVersion() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getRemoteService(gz1 gz1Var, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        short s = this.zzy;
        int i = qt1.f28784a;
        Scope[] scopeArr = is1.f21737r;
        Bundle bundle = new Bundle();
        ed1[] ed1VarArr = is1.f21738s;
        is1 is1Var = new is1(6, s, i, null, null, scopeArr, bundle, null, ed1VarArr, ed1VarArr, true, 0, false, str);
        is1Var.f21742g = this.zzl.getPackageName();
        is1Var.f21745j = getServiceRequestExtraArgs;
        if (set != null) {
            is1Var.f21744i = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            is1Var.f21746k = account;
            if (gz1Var != 0) {
                is1Var.f21743h = ((kl5) gz1Var).f23220b;
            }
        }
        is1Var.f21747l = zze;
        is1Var.f21748m = getApiFeatures();
        if (usesClientTelemetry()) {
            is1Var.f21751p = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        kn5 kn5Var = this.zzr;
                        if (kn5Var != null) {
                            int i2 = this.zzd.get();
                            ty5 ty5Var = new ty5("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 4);
                            ty5Var.f31550j = this;
                            ty5Var.f31551k = i2;
                            VarHandle.storeStoreFence();
                            kn5Var.m7569E(ty5Var, is1Var);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (DeadObjectException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i3 = this.zzd.get();
                ur5 ur5Var = this.zzb;
                ur5Var.sendMessage(ur5Var.obtainMessage(6, i3, 3));
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i4 = this.zzd.get();
            p36 p36Var = new p36(this, 8, null, null);
            ur5 ur5Var2 = this.zzb;
            ur5Var2.sendMessage(ur5Var2.obtainMessage(1, i4, -1, p36Var));
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.zzs;
                y42.m12855b0(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final qk0 getTelemetryConfiguration() {
        cc6 cc6Var = this.zzE;
        if (cc6Var == null) {
            return null;
        }
        return cc6Var.f15935g;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public final boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            byte b = this.zzv;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectionSuspended() {
        System.currentTimeMillis();
    }

    public final void onUserSignOut(wd3 wd3Var) {
        km5 km5Var = ((ol5) wd3Var.f33259b).f26868m.f31423m;
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 8);
        runnableC1029pc.f27515b = wd3Var;
        VarHandle.storeStoreFence();
        km5Var.post(runnableC1029pc);
    }

    public boolean requiresSignIn() {
        return false;
    }

    public final void setAttributionTag(String str) {
        this.zzA = str;
    }

    public boolean usesClientTelemetry() {
        return this instanceof vy5;
    }

    public final void zzc(cc6 cc6Var) {
        this.zzE = cc6Var;
        if (usesClientTelemetry()) {
            qk0 qk0Var = cc6Var.f15935g;
            ar3 ar3VarM3127r = ar3.m3127r();
            br3 br3Var = qk0Var == null ? null : qk0Var.f28534d;
            synchronized (ar3VarM3127r) {
                try {
                    if (br3Var == null) {
                        ar3VarM3127r.f14813b = ar3.f14806d;
                        return;
                    }
                    br3 br3Var2 = (br3) ar3VarM3127r.f14813b;
                    if (br3Var2 == null || br3Var2.f15524d < br3Var.f15524d) {
                        ar3VarM3127r.f14813b = br3Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                m11676b(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        byte b;
        int i;
        synchronized (this.zzp) {
            b = this.zzv;
        }
        if (b == 3) {
            this.zzD = true;
            i = 5;
        } else {
            i = 4;
        }
        ur5 ur5Var = this.zzb;
        ur5Var.sendMessage(ur5Var.obtainMessage(i, this.zzd.get(), 16));
    }

    public final boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(kn5 kn5Var) {
        this.zzr = kn5Var;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ InterfaceC1124rx zzk() {
        return this.zzw;
    }

    public final /* synthetic */ InterfaceC1161sx zzl() {
        return this.zzx;
    }

    public final /* synthetic */ lk0 zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(lk0 lk0Var) {
        this.zzC = lk0Var;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public final void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1235ux(int i, InterfaceC1124rx interfaceC1124rx, InterfaceC1161sx interfaceC1161sx, Context context, Looper looper) {
        tn6 tn6VarM11074a = tn6.m11074a(context);
        qt1 qt1Var = qt1.f28785b;
        y42.m12854a0(interfaceC1124rx);
        y42.m12854a0(interfaceC1161sx);
        this(context, looper, tn6VarM11074a, qt1Var, i, interfaceC1124rx, interfaceC1161sx, null);
    }
}
