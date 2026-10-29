package p000;

import ads_mobile_sdk.C0313rh;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ez5 extends C0927mz {

    /* JADX INFO: renamed from: F */
    public Context f18615F;

    /* JADX INFO: renamed from: G */
    public volatile byte f18616G;

    /* JADX INFO: renamed from: H */
    public volatile xr5 f18617H;

    /* JADX INFO: renamed from: I */
    public volatile k34 f18618I;

    /* JADX INFO: renamed from: J */
    public volatile ScheduledExecutorService f18619J;

    /* JADX INFO: renamed from: M */
    public final synchronized boolean m5426M() {
        return (this.f18616G != 2 || this.f18617H == null || this.f18618I == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final yz5 m5427N(int i) {
        if (m5426M()) {
            ch1 ch1Var = new ch1();
            ch1Var.f16016b = this;
            ch1Var.f16015a = i;
            VarHandle.storeStoreFence();
            return x06.m12450a(ch1Var);
        }
        qv5.m10140h("BillingClientTesting", "Billing Override Service is not ready.");
        m5428O(94, 28, rz5.m10511a(-1, "Billing Override Service connection is disconnected."));
        tz5 tz5Var = new tz5();
        tz5Var.f31571a = 0;
        VarHandle.storeStoreFence();
        return tz5Var;
    }

    /* JADX INFO: renamed from: O */
    public final void m5428O(int i, int i2, f00 f00Var) {
        int i3 = kz5.f23653a;
        yc6 yc6VarM7757b = kz5.m7757b(i, i2, f00Var, null, xd6.f34175b);
        Objects.requireNonNull(yc6VarM7757b, "ApiFailure should not be null");
        this.f25320h.m9620s(yc6VarM7757b);
    }

    /* JADX INFO: renamed from: P */
    public final void m5429P(int i) {
        int i2 = kz5.f23653a;
        fd6 fd6VarM7758c = kz5.m7758c(i, xd6.f34175b);
        Objects.requireNonNull(fd6VarM7758c, "ApiSuccess should not be null");
        pq3 pq3Var = this.f25320h;
        pq3Var.getClass();
        try {
            pq3Var.m9604D(fd6VarM7758c, (re6) pq3Var.f27896b);
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m5430Q(int i, wl0 wl0Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        yz5 yz5VarM5427N = m5427N(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f18619J == null) {
                    this.f18619J = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.f18619J;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!yz5VarM5427N.isDone()) {
            e06 e06Var = new e06();
            e06Var.f17576h = yz5VarM5427N;
            RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 21);
            runnableC1029pc.f27515b = e06Var;
            e06Var.f17577i = scheduledExecutorService.schedule(runnableC1029pc, 28500L, timeUnit);
            yz5VarM5427N.mo4845b(runnableC1029pc, bz5.f15714a);
            yz5VarM5427N = e06Var;
        }
        mf3 mf3Var = new mf3();
        mf3Var.f24858a = i;
        mf3Var.f24859b = wl0Var;
        mf3Var.f24860c = runnable;
        mf3Var.f24861d = this;
        VarHandle.storeStoreFence();
        ExecutorService executorServiceM8441g = m8441g();
        oz5 oz5Var = new oz5((byte) 0);
        oz5Var.f27249b = yz5VarM5427N;
        oz5Var.f27250c = mf3Var;
        VarHandle.storeStoreFence();
        yz5VarM5427N.mo4845b(oz5Var, executorServiceM8441g);
    }

    @Override // p000.C0927mz
    /* JADX INFO: renamed from: a */
    public final void mo5431a(C0973o7 c0973o7, C0964nz c0964nz) {
        mm1 mm1Var = new mm1((byte) 3);
        mm1Var.f25021b = c0964nz;
        VarHandle.storeStoreFence();
        yn3 yn3Var = new yn3((byte) 9);
        yn3Var.f35360b = this;
        yn3Var.f35361c = c0973o7;
        yn3Var.f35362d = c0964nz;
        VarHandle.storeStoreFence();
        m5430Q(3, mm1Var, yn3Var);
    }

    @Override // p000.C0927mz
    /* JADX INFO: renamed from: b */
    public final void mo5432b(C0973o7 c0973o7, C0964nz c0964nz) {
        dx5 dx5Var = new dx5();
        dx5Var.f17486a = c0964nz;
        dx5Var.f17487b = c0973o7;
        VarHandle.storeStoreFence();
        yn3 yn3Var = new yn3((byte) 8);
        yn3Var.f35360b = this;
        yn3Var.f35361c = c0973o7;
        yn3Var.f35362d = c0964nz;
        VarHandle.storeStoreFence();
        m5430Q(4, dx5Var, yn3Var);
    }

    @Override // p000.C0927mz
    /* JADX INFO: renamed from: c */
    public final void mo5433c() {
        synchronized (this) {
            m5429P(27);
            try {
                try {
                    if (this.f18618I != null && this.f18617H != null) {
                        qv5.m10139g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f18615F.unbindService(this.f18618I);
                        k34 k34Var = new k34((byte) 1);
                        k34Var.f22847b = this;
                        VarHandle.storeStoreFence();
                        this.f18618I = k34Var;
                    }
                    this.f18617H = null;
                    if (this.f18619J != null) {
                        this.f18619J.shutdownNow();
                        this.f18619J = null;
                    }
                } catch (RuntimeException e) {
                    qv5.m10141i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.f18616G = (byte) 3;
            } catch (Throwable th) {
                this.f18616G = (byte) 3;
                throw th;
            }
        }
        super.mo5433c();
    }

    @Override // p000.C0927mz
    /* JADX INFO: renamed from: d */
    public final f00 mo5434d(Activity activity, C1126rz c1126rz) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) m5427N(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            m5428O(C0313rh.f10758U0, 28, rz5.f29776s);
            qv5.m10141i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m5428O(95, 28, rz5.f29776s);
            qv5.m10141i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            f00 f00VarM10511a = rz5.m10511a(iIntValue, "Billing override value was set by a license tester.");
            m5428O(93, 2, f00VarM10511a);
            m8440I(f00VarM10511a);
            return f00VarM10511a;
        }
        try {
            return super.mo5434d(activity, c1126rz);
        } catch (Exception e3) {
            f00 f00Var = rz5.f29765h;
            m5428O(C0313rh.f10738K0, 2, f00Var);
            qv5.m10141i("BillingClientTesting", "An internal error occurred.", e3);
            return f00Var;
        }
    }

    @Override // p000.C0927mz
    /* JADX INFO: renamed from: e */
    public final void mo5435e(wd3 wd3Var, C1015oz c1015oz) {
        mm1 mm1Var = new mm1((byte) 2);
        mm1Var.f25021b = c1015oz;
        VarHandle.storeStoreFence();
        yn3 yn3Var = new yn3((byte) 7);
        yn3Var.f35360b = this;
        yn3Var.f35361c = wd3Var;
        yn3Var.f35362d = c1015oz;
        VarHandle.storeStoreFence();
        m5430Q(7, mm1Var, yn3Var);
    }

    @Override // p000.C0927mz
    /* JADX INFO: renamed from: f */
    public final void mo5436f(jp0 jp0Var) {
        synchronized (this) {
            if (m5426M()) {
                qv5.m10139g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                m5429P(26);
            } else {
                byte b = 1;
                if (this.f18616G == 1) {
                    qv5.m10140h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f18616G == 3) {
                    qv5.m10140h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    m5428O(38, 26, rz5.m10511a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f18616G = (byte) 1;
                    qv5.m10139g("BillingClientTesting", "Starting Billing Override Service setup.");
                    k34 k34Var = new k34(b);
                    k34Var.f22847b = this;
                    VarHandle.storeStoreFence();
                    this.f18618I = k34Var;
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.f18615F;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        b = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                qv5.m10140h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.f18618I, 1)) {
                                    qv5.m10139g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    qv5.m10140h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            b = 39;
                        }
                    }
                    this.f18616G = (byte) 0;
                    qv5.m10139g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    m5428O(b, 26, rz5.m10511a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        m8436E(jp0Var, 0);
    }
}
