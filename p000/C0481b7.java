package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0481b7 {

    /* JADX INFO: renamed from: a */
    public v00 f15128a;

    /* JADX INFO: renamed from: b */
    public q36 f15129b;

    /* JADX INFO: renamed from: c */
    public boolean f15130c;

    /* JADX INFO: renamed from: d */
    public Object f15131d;

    /* JADX INFO: renamed from: e */
    public wr5 f15132e;

    /* JADX INFO: renamed from: f */
    public Context f15133f;

    /* JADX INFO: renamed from: g */
    public long f15134g;

    /* JADX INFO: renamed from: a */
    public static C0008a7 m3471a(Context context) {
        C0481b7 c0481b7 = new C0481b7();
        c0481b7.f15131d = new Object();
        y42.m12854a0(context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        c0481b7.f15133f = context;
        c0481b7.f15130c = false;
        c0481b7.f15134g = -1L;
        VarHandle.storeStoreFence();
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0481b7.m3474c();
            C0008a7 c0008a7M3475e = c0481b7.m3475e();
            m3472d(c0008a7M3475e, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            c0481b7.m3473b();
            return c0008a7M3475e;
        } catch (Throwable th) {
            try {
                m3472d(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                c0481b7.m3473b();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3472d(C0008a7 c0008a7, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c0008a7 != null) {
                map.put("limit_ad_tracking", true != c0008a7.f145b ? "0" : "1");
                String str = c0008a7.f144a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new zm5(map).start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3473b() {
        y42.m12853Z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f15133f == null || this.f15128a == null) {
                    return;
                }
                try {
                    if (this.f15130c) {
                        ar3.m3128s().m3131B(this.f15133f, this.f15128a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f15130c = false;
                this.f15129b = null;
                this.f15128a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3474c() {
        y42.m12853Z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f15130c) {
                    m3473b();
                }
                Context context = this.f15133f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM10123b = qt1.f28785b.m10123b(context, 12451000);
                    if (iM10123b != 0 && iM10123b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    v00 v00Var = new v00();
                    v00Var.f32280a = false;
                    v00Var.f32281b = new LinkedBlockingQueue();
                    VarHandle.storeStoreFence();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ar3.m3128s().m3134E(context, context.getClass().getName(), intent, v00Var, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f15128a = v00Var;
                        try {
                            this.f15129b = b16.m3402E(v00Var.m11689a());
                            this.f15130c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new wt1();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0008a7 m3475e() {
        C0008a7 c0008a7;
        y42.m12853Z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f15130c) {
                    synchronized (this.f15131d) {
                        wr5 wr5Var = this.f15132e;
                        if (wr5Var == null || !wr5Var.f33666d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m3474c();
                        if (!this.f15130c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                y42.m12854a0(this.f15128a);
                y42.m12854a0(this.f15129b);
                try {
                    uy5 uy5Var = (uy5) this.f15129b;
                    uy5Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelM11683E = uy5Var.m11683E(parcelObtain, 1);
                    String string = parcelM11683E.readString();
                    parcelM11683E.recycle();
                    uy5 uy5Var2 = (uy5) this.f15129b;
                    uy5Var2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = lv5.f24405a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM11683E2 = uy5Var2.m11683E(parcelObtain2, 2);
                    boolean z = parcelM11683E2.readInt() != 0;
                    parcelM11683E2.recycle();
                    c0008a7 = new C0008a7();
                    c0008a7.f144a = string;
                    c0008a7.f145b = z;
                    VarHandle.storeStoreFence();
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f15131d) {
            wr5 wr5Var2 = this.f15132e;
            if (wr5Var2 != null) {
                wr5Var2.f33665c.countDown();
                try {
                    this.f15132e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f15134g;
            if (j > 0) {
                wr5 wr5Var3 = new wr5();
                wr5Var3.f33663a = new WeakReference(this);
                wr5Var3.f33664b = j;
                wr5Var3.f33665c = new CountDownLatch(1);
                wr5Var3.f33666d = false;
                wr5Var3.start();
                VarHandle.storeStoreFence();
                this.f15132e = wr5Var3;
            }
        }
        return c0008a7;
    }

    public final void finalize() throws Throwable {
        m3473b();
        super.finalize();
    }
}
