package p000;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fx5 {

    /* JADX INFO: renamed from: a */
    public AtomicReference f19393a;

    /* JADX INFO: renamed from: b */
    public Application f19394b;

    /* JADX INFO: renamed from: c */
    public yw5 f19395c;

    /* JADX INFO: renamed from: d */
    public Executor f19396d;

    /* JADX INFO: renamed from: e */
    public boolean f19397e;

    /* JADX INFO: renamed from: f */
    public AtomicReference f19398f;

    /* JADX INFO: renamed from: g */
    public AtomicReference f19399g;

    /* JADX INFO: renamed from: h */
    public AtomicReference f19400h;

    /* JADX INFO: renamed from: i */
    public AtomicReference f19401i;

    /* JADX INFO: renamed from: j */
    public AtomicReference f19402j;

    /* JADX INFO: renamed from: k */
    public AtomicReference f19403k;

    /* JADX INFO: renamed from: l */
    public AtomicReference f19404l;

    /* JADX INFO: renamed from: a */
    public final void m5845a(Queue queue, int i, int i2, String str) {
        Bundle bundle;
        Long l = (Long) queue.poll();
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            AtomicReference atomicReference = this.f19403k;
            Queue queue2 = (Queue) atomicReference.get();
            yw5 yw5Var = this.f19395c;
            Application application = yw5Var.f35568a;
            wa6 wa6VarM13462m = za6.m13462m();
            h76 h76VarM7428m = k86.m7428m();
            o76 o76VarM10232m = r76.m10232m();
            o76VarM10232m.m5769b();
            r76.m10235p((r76) o76VarM10232m.f19209b, i);
            if (str != null) {
                o76VarM10232m.m5769b();
                r76.m10233n((r76) o76VarM10232m.f19209b, str);
            }
            if (jCurrentTimeMillis > 0) {
                o76VarM10232m.m5769b();
                r76.m10234o((r76) o76VarM10232m.f19209b, jCurrentTimeMillis);
            }
            r76 r76Var = (r76) o76VarM10232m.m5768a();
            h76VarM7428m.m5769b();
            k86.m7433r((k86) h76VarM7428m.f19209b, r76Var);
            String str2 = yw5Var.f35572e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    yw5Var.f35572e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(yw5Var.f35572e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = yw5Var.f35572e;
            }
            if (str2 != null) {
                h76VarM7428m.m5769b();
                k86.m7430o((k86) h76VarM7428m.f19209b, str2);
            }
            f86 f86Var = yw5Var.f35569b;
            if (f86Var == null) {
                t76 t76VarM5614m = f86.m5614m();
                t76VarM5614m.m5769b();
                f86.m5615n((f86) t76VarM5614m.f19209b);
                f86Var = (f86) t76VarM5614m.m5768a();
                yw5Var.f35569b = f86Var;
            }
            h76VarM7428m.m5769b();
            k86.m7434s((k86) h76VarM7428m.f19209b, f86Var);
            m76 m76Var = yw5Var.f35571d;
            if (m76Var == null) {
                l76 l76VarM8215m = m76.m8215m();
                int i3 = Build.VERSION.SDK_INT;
                l76VarM8215m.m5769b();
                m76.m8216n((m76) l76VarM8215m.f19209b, i3);
                String str3 = Build.MODEL;
                l76VarM8215m.m5769b();
                m76.m8217o((m76) l76VarM8215m.f19209b);
                l76VarM8215m.m5769b();
                m76.m8219q((m76) l76VarM8215m.f19209b);
                String str4 = Build.VERSION.RELEASE;
                l76VarM8215m.m5769b();
                m76.m8218p((m76) l76VarM8215m.f19209b);
                m76Var = (m76) l76VarM8215m.m5768a();
                yw5Var.f35571d = m76Var;
            }
            h76VarM7428m.m5769b();
            k86.m7432q((k86) h76VarM7428m.f19209b, m76Var);
            e76 e76Var = yw5Var.f35570c;
            if (e76Var == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    a76 a76VarM4942m = e76.m4942m();
                    String string = Long.toString(packageInfo.getLongVersionCode());
                    a76VarM4942m.m5769b();
                    e76.m4944o((e76) a76VarM4942m.f19209b, string);
                    a76VarM4942m.m5769b();
                    e76.m4943n((e76) a76VarM4942m.f19209b, packageName);
                    yw5Var.f35570c = (e76) a76VarM4942m.m5768a();
                }
                e76Var = yw5Var.f35570c;
            }
            if (e76Var != null) {
                h76VarM7428m.m5769b();
                k86.m7431p((k86) h76VarM7428m.f19209b, e76Var);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string2 != null && !string2.isEmpty()) {
                a06 a06Var = new a06();
                a06Var.f24b = (byte) 2;
                a06Var.f26d = 0;
                a06Var.f27e = Integer.MAX_VALUE;
                a06Var.f25c = string2;
                VarHandle.storeStoreFence();
                while (a06Var.hasNext()) {
                    String str5 = (String) a06Var.next();
                    h76VarM7428m.m5769b();
                    k86.m7429n((k86) h76VarM7428m.f19209b, str5);
                }
            }
            k86 k86Var = (k86) h76VarM7428m.m5768a();
            wa6VarM13462m.m5769b();
            za6.m13463n((za6) wa6VarM13462m.f19209b, k86Var);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            wa6VarM13462m.m5769b();
            za6.m13464o((za6) wa6VarM13462m.f19209b, jCurrentTimeMillis2);
            queue2.add((za6) wa6VarM13462m.m5768a());
            if (this.f19397e) {
                ((ArrayDeque) this.f19404l.get()).addAll((Collection) atomicReference.get());
            }
            Executor executor = this.f19396d;
            RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 19);
            runnableC1029pc.f27515b = this;
            VarHandle.storeStoreFence();
            executor.execute(runnableC1029pc);
        }
    }
}
