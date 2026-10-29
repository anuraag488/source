package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yg3 implements xi3, dv3, le4, b04, w33, ns5, pv4, dr6, j16 {

    /* JADX INFO: renamed from: d */
    public static yg3 f35213d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35214a;

    /* JADX INFO: renamed from: b */
    public Object f35215b;

    /* JADX INFO: renamed from: c */
    public Object f35216c;

    public /* synthetic */ yg3(Object obj, Object obj2, byte b) {
        this.f35214a = b;
        this.f35215b = obj;
        this.f35216c = obj2;
    }

    /* JADX INFO: renamed from: l */
    public static yg3 m13115l() {
        if (!kz4.f23643e.mo7351a()) {
            throw kz4.m7754a();
        }
        yg3 yg3Var = f35213d;
        if (yg3Var != null) {
            return yg3Var;
        }
        ProfileStoreBoundaryInterface profileStore = mz4.f25346a.getProfileStore();
        yg3 yg3Var2 = new yg3((byte) 0);
        yg3Var2.f35216c = new HashMap();
        yg3Var2.f35215b = profileStore;
        VarHandle.storeStoreFence();
        f35213d = yg3Var2;
        return yg3Var2;
    }

    @Override // p000.xi3
    /* JADX INFO: renamed from: a */
    public void mo7973a(wi3 wi3Var, int i) throws IOException {
        int[] iArr = (int[]) this.f35216c;
        try {
            wi3Var.read((byte[]) this.f35215b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            wi3Var.close();
        }
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: b */
    public int mo3386b(int i) {
        do {
            i = ((n83) this.f35216c).m8606j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f35215b).charAt(i)));
        return i;
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: c */
    public int mo3387c(int i) {
        do {
            i = ((n83) this.f35216c).m8605i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f35215b).charAt(i - 1)));
        return i;
    }

    @Override // p000.dv3
    /* JADX INFO: renamed from: d */
    public Object mo4749d(Object obj) {
        return ((yp1) this.f35216c).invoke(obj);
    }

    @Override // p000.pv4
    /* JADX INFO: renamed from: e */
    public void mo3678e(ts5 ts5Var) {
        ts5Var.m11129a((Activity) this.f35215b, (C0714h6) this.f35216c);
    }

    @Override // p000.j16
    /* JADX INFO: renamed from: f */
    public void mo3680f() throws IOException {
        int i;
        i16 i16Var = (i16) this.f35215b;
        ByteBuffer byteBuffer = (ByteBuffer) this.f35216c;
        ReadableByteChannel readableByteChannel = i16Var.f21030n;
        r06 r06Var = i16Var.f21017a;
        if (readableByteChannel != null) {
            i16Var.f21039w++;
            i = readableByteChannel.read(byteBuffer);
        } else {
            i = -1;
        }
        boolean z = false;
        byte b = 0;
        if (i != -1) {
            m26 m26Var = i16Var.f21031o;
            tt2 tt2Var = new tt2((byte) 25, z);
            tt2Var.f31428b = r06Var;
            tt2Var.f31429c = m26Var;
            tt2Var.f31430d = byteBuffer;
            VarHandle.storeStoreFence();
            r06Var.m10176a(tt2Var, "onReadCompleted");
            return;
        }
        ReadableByteChannel readableByteChannel2 = i16Var.f21030n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (i16Var.f21022f.compareAndSet(5, 7)) {
            gy5 gy5Var = new gy5((byte) 0);
            gy5Var.f20201b = i16Var;
            VarHandle.storeStoreFence();
            i16Var.m6558c(gy5Var, "fireDisconnect");
            m26 m26Var2 = i16Var.f21031o;
            d06 d06Var = new d06(b == true ? 1 : 0);
            d06Var.f16690b = r06Var;
            d06Var.f16691c = m26Var2;
            VarHandle.storeStoreFence();
            r06Var.m10177b(d06Var, "onSucceeded");
        }
    }

    @Override // p000.ns5
    /* JADX INFO: renamed from: g */
    public r36 mo5322g(aq5 aq5Var) {
        r36 r36VarM10196g = ((r36) this.f35215b).m10196g();
        r36VarM10196g.m10199k((String) this.f35216c, aq5Var);
        return r36VarM10196g;
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: h */
    public int mo3388h(int i) {
        CharSequence charSequence = (CharSequence) this.f35215b;
        do {
            i = ((n83) this.f35216c).m8605i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: i */
    public int mo3389i(int i) {
        do {
            i = ((n83) this.f35216c).m8606j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f35215b).charAt(i - 1)));
        return i;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ Object mo4146j() {
        switch (this.f35214a) {
            case 16:
                return m13120r();
            default:
                return m13118p();
        }
    }

    @Override // p000.dv3
    /* JADX INFO: renamed from: k */
    public Object mo4750k(fu3 fu3Var, Object obj) {
        return ((mq1) this.f35215b).invoke(fu3Var, obj);
    }

    /* JADX INFO: renamed from: m */
    public ug3 m13116m(String str) {
        if (!kz4.f23643e.mo7351a()) {
            throw kz4.m7754a();
        }
        HashMap map = (HashMap) this.f35216c;
        xg3 xg3Var = new xg3();
        xg3Var.f34271a = this;
        xg3Var.f34272b = str;
        VarHandle.storeStoreFence();
        return (ug3) map.computeIfAbsent(str, xg3Var);
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) throws Throwable {
        FileWriter fileWriter;
        C1372yl c1372yl = (C1372yl) this.f35216c;
        ExecutorService executorService = (ExecutorService) ((yq0) ((jp0) this.f35215b).f22483d).f35458b;
        sj0 sj0Var = new sj0((byte) 4);
        sj0Var.f30325b = this;
        VarHandle.storeStoreFence();
        JSONObject jSONObject = (JSONObject) executorService.submit(sj0Var).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            c44 c44VarM12237m = ((wd3) c1372yl.f35306c).m12237m(jSONObject);
            ar3 ar3Var = (ar3) c1372yl.f35308e;
            long j = c44VarM12237m.f15798c;
            ar3Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) ar3Var.f14813b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        se0.m10731l(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                se0.m10731l(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            se0.m10731l(fileWriter, "Failed to close settings writer.");
            String str = "Loaded settings: " + jSONObject.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            String str2 = ((j44) c1372yl.f35305b).f22010f;
            SharedPreferences.Editor editorEdit = ((Context) c1372yl.f35304a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str2);
            editorEdit.apply();
            ((AtomicReference) c1372yl.f35310g).set(c44VarM12237m);
            ((li4) ((AtomicReference) c1372yl.f35311h).get()).m7990c(c44VarM12237m);
        }
        return y62.m12936B(null);
    }

    /* JADX INFO: renamed from: o */
    public String m13117o(String str) {
        String str2 = (String) this.f35216c;
        Resources resources = (Resources) this.f35215b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // p000.w33
    public void onComplete(nr6 nr6Var) {
        ((Map) ((pq3) this.f35216c).f27897c).remove((li4) this.f35215b);
    }

    /* JADX INFO: renamed from: p */
    public yg3 m13118p() {
        Application application = (Application) ((C1392z4) this.f35215b).f35744a;
        mq5 mq5Var = (mq5) ((cr6) this.f35216c).mo4146j();
        yg3 yg3Var = new yg3((byte) 22);
        yg3Var.f35215b = application;
        yg3Var.f35216c = mq5Var;
        VarHandle.storeStoreFence();
        return yg3Var;
    }

    /* JADX INFO: renamed from: q */
    public Object m13119q() {
        String string;
        rd6 rd6Var = (rd6) this.f35215b;
        String str = (String) this.f35216c;
        Context context = (Context) rd6Var.f29197c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        if1 if1Var = nc6.f25688a;
        String str2 = null;
        if (contentResolver == null) {
            if1Var.getClass();
            C1077qn.m9989o("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
        synchronized (if1Var) {
            try {
                HashMap map = (HashMap) if1Var.f21325b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) if1Var.f21324a;
                byte b = 1;
                if (map == null) {
                    atomicBoolean.set(false);
                    if1Var.f21325b = new HashMap(16, 1.0f);
                    if1Var.f21330g = new Object();
                    contentResolver.registerContentObserver(qc6.f28388a, true, new n15(if1Var, b));
                } else if (atomicBoolean.getAndSet(false)) {
                    ((HashMap) if1Var.f21325b).clear();
                    ((HashMap) if1Var.f21326c).clear();
                    ((HashMap) if1Var.f21327d).clear();
                    ((HashMap) if1Var.f21328e).clear();
                    ((HashMap) if1Var.f21329f).clear();
                    if1Var.f21330g = new Object();
                }
                Object obj = if1Var.f21330g;
                if (((HashMap) if1Var.f21325b).containsKey(str)) {
                    String str3 = (String) ((HashMap) if1Var.f21325b).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    Uri uri = qc6.f28388a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new wc6("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new wc6("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (if1Var) {
                                    try {
                                        if (obj == if1Var.f21330g) {
                                            ((HashMap) if1Var.f21325b).put(str, string);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (Throwable th2) {
                                if (cursorQuery == null) {
                                    throw th2;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (RemoteException e) {
                            throw new wc6("ContentProvider query failed", e);
                        }
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                } catch (wc6 unused) {
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public ru5 m13120r() {
        wu5 wu5Var = (wu5) ((cr6) this.f35215b).mo4146j();
        Handler handler = ky5.f23626a;
        g06.m5881a(handler);
        C1372yl c1372ylM4960x = ((C0602e8) this.f35216c).mo4146j();
        ru5 ru5Var = new ru5(wu5Var);
        ru5Var.f29649c = false;
        ru5Var.f29647a = handler;
        ru5Var.f29648b = c1372ylM4960x;
        VarHandle.storeStoreFence();
        return ru5Var;
    }

    /* JADX INFO: renamed from: s */
    public void m13121s(zq5 zq5Var) {
        ArrayList arrayList = zq5Var.f36268a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f35216c).put(Integer.valueOf(((kt5) obj).f23496a).toString(), zq5Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public aq5 m13122t(r36 r36Var, aq5 aq5Var) {
        w76.m12166m(r36Var);
        if (!(aq5Var instanceof dq5)) {
            return aq5Var;
        }
        dq5 dq5Var = (dq5) aq5Var;
        ArrayList arrayList = dq5Var.f17287b;
        String str = dq5Var.f17286a;
        HashMap map = (HashMap) this.f35216c;
        return (map.containsKey(str) ? (zq5) map.get(str) : (zq5) this.f35215b).m13727a(str, r36Var, arrayList);
    }

    public String toString() {
        switch (this.f35214a) {
            case 8:
                return "Bounds{lower=" + ((g42) this.f35215b) + " upper=" + ((g42) this.f35216c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m13123u(r36 r36Var, tt2 tt2Var) {
        wf6 wf6Var = new wf6();
        wf6Var.f33346b = tt2Var;
        VarHandle.storeStoreFence();
        TreeMap treeMap = (TreeMap) this.f35215b;
        for (Integer num : treeMap.keySet()) {
            en5 en5VarClone = ((en5) tt2Var.f31429c).clone();
            aq5 aq5VarMo4517f = ((vp5) treeMap.get(num)).mo4517f(r36Var, Collections.singletonList(wf6Var));
            int iM12162i = aq5VarMo4517f instanceof xo5 ? w76.m12162i(((xo5) aq5VarMo4517f).f34512a.doubleValue()) : -1;
            if (iM12162i == 2 || iM12162i == -1) {
                tt2Var.f31429c = en5VarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f35216c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            aq5 aq5VarMo4517f2 = ((vp5) treeMap2.get((Integer) it.next())).mo4517f(r36Var, Collections.singletonList(wf6Var));
            if (aq5VarMo4517f2 instanceof xo5) {
                w76.m12162i(((xo5) aq5VarMo4517f2).f34512a.doubleValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: v */
    public wo5 m13124v(Activity activity, f70 f70Var) throws n56 {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        f70Var.getClass();
        Application application = (Application) this.f35215b;
        boolean z = false;
        boolean z2 = hz5.m6533b() || new ArrayList().contains(kx5.m7743x0(application.getApplicationContext()));
        wo5 wo5Var = new wo5();
        wo5Var.f33570e = Collections.EMPTY_MAP;
        wo5Var.f33574i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new n56(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        wo5Var.f33566a = string;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dw5.f17469a);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        wo5Var.f33574i = list;
        wo5Var.f33570e = ((mq5) this.f35216c).m8377a();
        wo5Var.f33569d = Boolean.FALSE;
        wo5Var.f33568c = Locale.getDefault().toLanguageTag();
        jw5 jw5Var = new jw5();
        jw5Var.f22706c = (byte) 1;
        jw5Var.f22705b = Integer.valueOf(Build.VERSION.SDK_INT);
        jw5Var.f22704a = Build.MODEL;
        jw5Var.f22706c = (byte) 2;
        wo5Var.f33567b = jw5Var;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        C1283w7 c1283w7 = new C1283w7((byte) 29);
        Object arrayList2 = Collections.EMPTY_LIST;
        c1283w7.f33129e = arrayList2;
        c1283w7.f33126b = Integer.valueOf(configuration.screenWidthDp);
        c1283w7.f33127c = Integer.valueOf(configuration.screenHeightDp);
        c1283w7.f33128d = Double.valueOf(application.getResources().getDisplayMetrics().density);
        Window window = activity == null ? null : activity.getWindow();
        View decorView = window == null ? null : window.getDecorView();
        WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
        if (displayCutout != null) {
            displayCutout.getSafeInsetBottom();
            arrayList2 = new ArrayList();
            for (Rect rect : displayCutout.getBoundingRects()) {
                if (rect != null) {
                    lw5 lw5Var = new lw5();
                    lw5Var.f24426b = Integer.valueOf(rect.left);
                    lw5Var.f24427c = Integer.valueOf(rect.right);
                    lw5Var.f24425a = Integer.valueOf(rect.top);
                    lw5Var.f24428d = Integer.valueOf(rect.bottom);
                    arrayList2.add(lw5Var);
                }
            }
        }
        c1283w7.f33129e = arrayList2;
        wo5Var.f33571f = c1283w7;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        tt2 tt2Var = new tt2((byte) 24, z);
        tt2Var.f31428b = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        tt2Var.f31429c = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            tt2Var.f31430d = Long.toString(packageInfo.getLongVersionCode());
        }
        wo5Var.f33572g = tt2Var;
        wo5Var.f33573h = new aj5((byte) 8);
        return wo5Var;
    }

    public /* synthetic */ yg3(byte b) {
        this.f35214a = b;
    }
}
