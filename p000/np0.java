package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class np0 {

    /* JADX INFO: renamed from: r */
    public static final ip0 f25991r = new ip0((byte) 1);

    /* JADX INFO: renamed from: s */
    public static final Charset f25992s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f25993a;

    /* JADX INFO: renamed from: b */
    public final bt0 f25994b;

    /* JADX INFO: renamed from: c */
    public final z32 f25995c;

    /* JADX INFO: renamed from: d */
    public final if1 f25996d;

    /* JADX INFO: renamed from: e */
    public final jp0 f25997e;

    /* JADX INFO: renamed from: f */
    public final q02 f25998f;

    /* JADX INFO: renamed from: g */
    public final if1 f25999g;

    /* JADX INFO: renamed from: h */
    public final C1372yl f26000h;

    /* JADX INFO: renamed from: i */
    public final z32 f26001i;

    /* JADX INFO: renamed from: j */
    public final sp0 f26002j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0976oa f26003k;

    /* JADX INFO: renamed from: l */
    public final kp0 f26004l;

    /* JADX INFO: renamed from: m */
    public final C0602e8 f26005m;

    /* JADX INFO: renamed from: n */
    public xq0 f26006n;

    /* JADX INFO: renamed from: o */
    public final li4 f26007o = new li4();

    /* JADX INFO: renamed from: p */
    public final li4 f26008p = new li4();

    /* JADX INFO: renamed from: q */
    public final li4 f26009q = new li4();

    public np0(Context context, q02 q02Var, bt0 bt0Var, if1 if1Var, z32 z32Var, C1372yl c1372yl, if1 if1Var2, z32 z32Var2, C0602e8 c0602e8, sp0 sp0Var, InterfaceC0976oa interfaceC0976oa, kp0 kp0Var, jp0 jp0Var) {
        new AtomicBoolean(false);
        this.f25993a = context;
        this.f25998f = q02Var;
        this.f25994b = bt0Var;
        this.f25999g = if1Var;
        this.f25995c = z32Var;
        this.f26000h = c1372yl;
        this.f25996d = if1Var2;
        this.f26001i = z32Var2;
        this.f26002j = sp0Var;
        this.f26003k = interfaceC0976oa;
        this.f26004l = kp0Var;
        this.f26005m = c0602e8;
        this.f25997e = jp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0591  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [int] */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX INFO: renamed from: a */
    public final void m8807a(boolean z, C1372yl c1372yl, boolean z2) throws Throwable {
        ArrayList arrayList;
        boolean z3;
        int i;
        int i2;
        String str;
        boolean z4;
        String str2;
        String strSubstring;
        String str3;
        boolean z5;
        List listM11640b;
        ApplicationExitInfo next;
        String strM4947m;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ig1 ig1Var = ig1.f21399w;
        sp0 sp0Var = this.f26002j;
        jp0.m7209m();
        C0602e8 c0602e8 = this.f26005m;
        ArrayList arrayList2 = new ArrayList(((wq0) c0602e8.f17868b).m12373c());
        if (arrayList2.size() <= z) {
            ig1Var.m6801p("No open sessions to be closed.");
            return;
        }
        String str4 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && c1372yl.m13167e().f15797b.f34840c) {
            if1 if1Var = this.f25999g;
            i = 4;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f25993a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                z32 z32Var = new z32(if1Var);
                z32Var.m13316N(str4);
                i2 = 8;
                jp0 jp0Var = this.f25997e;
                us2 us2Var = new us2(if1Var);
                if1 if1Var2 = new if1(str4, if1Var, jp0Var);
                ((sd2) ((AtomicMarkableReference) ((C1126rz) if1Var2.f21327d).f29738b).getReference()).m10688c(us2Var.m11644c(str4, false));
                ((sd2) ((AtomicMarkableReference) ((C1126rz) if1Var2.f21328e).f29738b).getReference()).m10688c(us2Var.m11644c(str4, true));
                ((AtomicMarkableReference) if1Var2.f21330g).set(us2Var.m11645d(str4), false);
                oq3 oq3Var = (oq3) if1Var2.f21329f;
                File fileM6788c = if1Var.m6788c(str4, "rollouts-state");
                if (!fileM6788c.exists() || fileM6788c.length() == 0) {
                    us2.m11643g(fileM6788c, "The file has a length of zero for session: " + str4);
                    listM11640b = Collections.EMPTY_LIST;
                } else {
                    try {
                        fileInputStream2 = new FileInputStream(fileM6788c);
                        try {
                            try {
                                listM11640b = us2.m11640b(se0.m10714b0(fileInputStream2));
                                ig1Var.m6798m("Loaded rollouts state:\n" + listM11640b + "\nfor session " + str4, null);
                                se0.m10731l(fileInputStream2, "Failed to close rollouts state file.");
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                se0.m10731l(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                            us2.m11642f(fileM6788c);
                            se0.m10731l(fileInputStream2, "Failed to close rollouts state file.");
                            listM11640b = Collections.EMPTY_LIST;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                        se0.m10731l(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                }
                oq3Var.m9237b(listM11640b);
                wq0 wq0Var = (wq0) c0602e8.f17868b;
                long jLastModified = wq0Var.f33605b.m6788c(str4, "start-time").lastModified();
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.getTimestamp() < jLastModified) {
                        }
                    }
                    next = null;
                    break;
                } while (next.getReason() != 6);
                if (next == null) {
                    String strM13620t = zi4.m13620t("No relevant ApplicationExitInfo occurred during session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strM13620t, null);
                    }
                    arrayList = arrayList2;
                    c0602e8 = c0602e8;
                    z3 = true;
                } else {
                    uq0 uq0Var = (uq0) c0602e8.f17867a;
                    try {
                        InputStream traceInputStream = next.getTraceInputStream();
                        strM4947m = traceInputStream != null ? C0602e8.m4947m(traceInputStream) : null;
                    } catch (IOException e3) {
                        Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e3, null);
                    }
                    C0846ks c0846ks = new C0846ks();
                    c0846ks.f23372d = next.getImportance();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 4);
                    String processName = next.getProcessName();
                    if (processName == null) {
                        xy4.m12782k("Null processName");
                        return;
                    }
                    c0846ks.f23370b = processName;
                    c0846ks.f23371c = next.getReason();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 2);
                    c0846ks.f23375g = next.getTimestamp();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 32);
                    c0846ks.f23369a = next.getPid();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 1);
                    c0846ks.f23373e = next.getPss();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 8);
                    c0846ks.f23374f = next.getRss();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 16);
                    c0846ks.f23376h = strM4947m;
                    C0883ls c0883lsM7590a = c0846ks.m7590a();
                    int i3 = uq0Var.f32089a.getResources().getConfiguration().orientation;
                    C1305ws c1305ws = new C1305ws();
                    c1305ws.f33670b = "anr";
                    long j = c0883lsM7590a.f24327g;
                    c1305ws.f33669a = j;
                    c1305ws.f33675g = (byte) (c1305ws.f33675g | 1);
                    C1372yl c1372yl2 = uq0Var.f32091c;
                    if (!uq0Var.f32093e.m13167e().f15797b.f34841d || ((ArrayList) c1372yl2.f35310g).size() <= 0) {
                        arrayList = arrayList2;
                        listUnmodifiableList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) c1372yl2.f35310g;
                        int size = arrayList4.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList4.get(i4);
                            int i5 = i4 + 1;
                            p40 p40Var = (p40) obj;
                            int i6 = size;
                            String str5 = p40Var.f27347a;
                            if (str5 == null) {
                                xy4.m12782k("Null libraryName");
                                return;
                            }
                            ArrayList arrayList5 = arrayList4;
                            String str6 = p40Var.f27348b;
                            if (str6 == null) {
                                xy4.m12782k("Null arch");
                                return;
                            }
                            String str7 = p40Var.f27349c;
                            if (str7 == null) {
                                xy4.m12782k("Null buildId");
                                return;
                            }
                            ArrayList arrayList6 = arrayList2;
                            C0920ms c0920ms = new C0920ms();
                            c0920ms.f25176a = str6;
                            c0920ms.f25177b = str5;
                            c0920ms.f25178c = str7;
                            VarHandle.storeStoreFence();
                            arrayList3.add(c0920ms);
                            i4 = i5;
                            size = i6;
                            arrayList4 = arrayList5;
                            arrayList2 = arrayList6;
                        }
                        arrayList = arrayList2;
                        listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                    }
                    C0846ks c0846ks2 = new C0846ks();
                    c0846ks2.f23372d = c0883lsM7590a.f24324d;
                    byte b = (byte) (c0846ks2.f23378j | 4);
                    c0846ks2.f23378j = b;
                    String str8 = c0883lsM7590a.f24322b;
                    if (str8 == null) {
                        xy4.m12782k("Null processName");
                        return;
                    }
                    c0846ks2.f23370b = str8;
                    c0846ks2.f23371c = c0883lsM7590a.f24323c;
                    c0846ks2.f23375g = j;
                    c0846ks2.f23369a = c0883lsM7590a.f24321a;
                    c0846ks2.f23373e = c0883lsM7590a.f24325e;
                    c0846ks2.f23374f = c0883lsM7590a.f24326f;
                    c0846ks2.f23378j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                    c0846ks2.f23376h = c0883lsM7590a.f24328h;
                    c0846ks2.f23377i = listUnmodifiableList;
                    C0883ls c0883lsM7590a2 = c0846ks2.m7590a();
                    int i7 = c0883lsM7590a2.f24324d;
                    boolean z6 = i7 != 100;
                    C1379ys c1379ys = new C1379ys();
                    c1379ys.f35486d = Boolean.valueOf(z6);
                    String str9 = c0883lsM7590a2.f24322b;
                    int i8 = c0883lsM7590a2.f24321a;
                    C0921mt c0921mt = new C0921mt();
                    c0921mt.f25181a = str9;
                    c0921mt.f25182b = i8;
                    byte b2 = (byte) (c0921mt.f25185e | 1);
                    c0921mt.f25183c = i7;
                    c0921mt.f25184d = false;
                    c0921mt.f25185e = (byte) (((byte) (b2 | 2)) | 4);
                    c1379ys.f35487e = c0921mt.m8390a();
                    c1379ys.f35489g = i3;
                    c1379ys.f35490h = (byte) (c1379ys.f35490h | 1);
                    C0663ft c0663ft = new C0663ft();
                    c0663ft.f19265a = "0";
                    c0663ft.f19266b = "0";
                    c0663ft.f19267c = 0L;
                    c0663ft.f19268d = (byte) (c0663ft.f19268d | 1);
                    C0700gt c0700gtM5803a = c0663ft.m5803a();
                    List listM11605a = uq0Var.m11605a();
                    if (listM11605a == null) {
                        xy4.m12782k("Null binaries");
                        return;
                    }
                    C0466at c0466at = new C0466at();
                    c0466at.f14847a = null;
                    c0466at.f14848b = null;
                    c0466at.f14849c = c0883lsM7590a2;
                    c0466at.f14850d = c0700gtM5803a;
                    c0466at.f14851e = listM11605a;
                    VarHandle.storeStoreFence();
                    c1379ys.f35483a = c0466at;
                    c1305ws.f33671c = c1379ys.m13230a();
                    c1305ws.f33672d = uq0Var.m11606b(i3);
                    C1342xs c1342xsM12388a = c1305ws.m12388a();
                    String strM13620t2 = zi4.m13620t("Persisting anr for session ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strM13620t2, null);
                    }
                    z3 = true;
                    wq0Var.m12374d(C0602e8.m4946i(C0602e8.m4945h(c1342xsM12388a, z32Var, if1Var2, Collections.EMPTY_MAP), if1Var2), str4, true);
                }
            } else {
                arrayList = arrayList2;
                c0602e8 = c0602e8;
                z3 = true;
                i2 = 8;
                ig1Var.m6801p("No ApplicationExitInfo available. Session: " + str4);
            }
        } else {
            arrayList = arrayList2;
            c0602e8 = c0602e8;
            z3 = true;
            i = 4;
            i2 = 8;
            ig1Var.m6801p("ANR feature disabled.");
        }
        if (z2 && sp0Var.m10890c()) {
            ig1Var.m6801p("Finalizing native report for session " + str4);
            sp0Var.m10888a().getClass();
            str = null;
            ig1Var.m6802q("No minidump data found for session " + str4, null);
            ig1Var.m6800o("No Tombstones data found for session " + str4);
            ig1Var.m6802q("No native core present", null);
        } else {
            str = null;
        }
        if (z != 0) {
            z4 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z4 = false;
            this.f26004l.m7570a(str);
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        wq0 wq0Var2 = (wq0) c0602e8.f17868b;
        if1 if1Var3 = wq0Var2.f33605b;
        if1Var3.m6787b(".com.google.firebase.crashlytics");
        if1Var3.m6787b(".com.google.firebase.crashlytics-ndk");
        if (!((String) if1Var3.f21324a).isEmpty()) {
            if1Var3.m6787b(".com.google.firebase.crashlytics.files.v1");
            String str10 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) if1Var3.f21325b;
            if (file.exists()) {
                hf1 hf1Var = new hf1();
                hf1Var.f20530a = str10;
                VarHandle.storeStoreFence();
                String[] list = file.list(hf1Var);
                if (list != null) {
                    int length = list.length;
                    for (?? r9 = z4; r9 < length; r9++) {
                        if1Var3.m6787b(list[r9]);
                    }
                }
            }
        }
        NavigableSet<String> navigableSetM12373c = wq0Var2.m12373c();
        if (str2 != null) {
            navigableSetM12373c.remove(str2);
        }
        int i9 = i2;
        if (navigableSetM12373c.size() > i9) {
            while (navigableSetM12373c.size() > i9) {
                String str11 = (String) navigableSetM12373c.last();
                String strM13620t3 = zi4.m13620t("Removing session over cap: ", str11);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strM13620t3, null);
                }
                if1.m6784e(new File((File) if1Var3.f21327d, str11));
                navigableSetM12373c.remove(str11);
            }
        }
        for (String str12 : navigableSetM12373c) {
            String strM13620t4 = zi4.m13620t("Finalizing report for session ", str12);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM13620t4, null);
            }
            vq0 vq0Var = wq0.f33601g;
            ip0 ip0Var = wq0.f33603i;
            File file2 = new File((File) if1Var3.f21327d, str12);
            file2.mkdirs();
            List<File> listM6785f = if1.m6785f(file2.listFiles(ip0Var));
            if (listM6785f.isEmpty()) {
                String strM13621u = zi4.m13621u("Session ", str12, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM13621u, null);
                }
            } else {
                Collections.sort(listM6785f);
                ArrayList arrayList7 = new ArrayList();
                boolean z7 = z4;
                for (File file3 : listM6785f) {
                    try {
                        String strM12370e = wq0.m12370e(file3);
                        vq0Var.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strM12370e));
                            try {
                                C1342xs c1342xsM11956d = vq0.m11956d(jsonReader);
                                jsonReader.close();
                                arrayList7.add(c1342xsM11956d);
                                if (z7) {
                                    z5 = z3;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                z7 = z5;
                            } catch (Throwable th3) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e5);
                    }
                }
                if (arrayList7.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str12, null);
                } else {
                    String strM11645d = new us2(if1Var3).m11645d(str12);
                    jp0 jp0Var2 = wq0Var2.f33607d.f23308b;
                    synchronized (jp0Var2) {
                        if (Objects.equals((String) jp0Var2.f22482c, str12)) {
                            str3 = (String) jp0Var2.f22483d;
                        } else {
                            if1 if1Var4 = (if1) jp0Var2.f22481b;
                            ip0 ip0Var2 = jp0.f22477e;
                            File file4 = new File((File) if1Var4.f21327d, str12);
                            file4.mkdirs();
                            List listM6785f2 = if1.m6785f(file4.listFiles(ip0Var2));
                            if (listM6785f2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listM6785f2, jp0.f22478f)).getName().substring(i);
                            }
                            str3 = strSubstring;
                        }
                    }
                    File fileM6788c2 = if1Var3.m6788c(str12, "report");
                    try {
                        String strM12370e2 = wq0.m12370e(fileM6788c2);
                        vq0Var.getClass();
                        C0773is c0773isM11088b = vq0.m11961i(strM12370e2).m11088b(jCurrentTimeMillis, strM11645d, z7);
                        C0736hs c0736hsMo6928a = c0773isM11088b.mo6928a();
                        c0736hsMo6928a.f20816g = str3;
                        sq0 sq0Var = c0773isM11088b.f21732k;
                        if (sq0Var != null) {
                            C1082qs c1082qsMo10421a = sq0Var.mo10421a();
                            c1082qsMo10421a.f28733c = str3;
                            c0736hsMo6928a.f20819j = c1082qsMo10421a.m10049a();
                        }
                        C0773is c0773isM6491a = c0736hsMo6928a.m6491a();
                        sq0 sq0Var2 = c0773isM6491a.f21732k;
                        if (sq0Var2 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        C0736hs c0736hsMo6928a2 = c0773isM6491a.mo6928a();
                        C1082qs c1082qsMo10421a2 = sq0Var2.mo10421a();
                        c1082qsMo10421a2.f28741k = arrayList7;
                        c0736hsMo6928a2.f20819j = c1082qsMo10421a2.m10049a();
                        C0773is c0773isM6491a2 = c0736hsMo6928a2.m6491a();
                        sq0 sq0Var3 = c0773isM6491a2.f21732k;
                        if (sq0Var3 != null) {
                            String str13 = "appQualitySessionId: " + str3;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str13, null);
                                    } catch (IOException e6) {
                                        e = e6;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM6788c2, e);
                                    }
                                }
                                wq0.m12371f(z7 ? new File((File) if1Var3.f21329f, ((C1119rs) sq0Var3).f29560b) : new File((File) if1Var3.f21328e, ((C1119rs) sq0Var3).f29560b), vq0.f32797a.m12084h(c0773isM6491a2));
                            } catch (IOException e7) {
                                e = e7;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM6788c2, e);
                            }
                        }
                        e = e6;
                    } catch (IOException e8) {
                        e = e8;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM6788c2, e);
                }
                if1.m6784e(new File((File) if1Var3.f21327d, str12));
                z4 = false;
                i = 4;
            }
            if1.m6784e(new File((File) if1Var3.f21327d, str12));
            z4 = false;
            i = 4;
        }
        z34 z34Var = wq0Var2.f33606c.m13167e().f15796a;
        ArrayList arrayListM12372b = wq0Var2.m12372b();
        int size2 = arrayListM12372b.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = arrayListM12372b.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8808b(String str, Boolean bool) {
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ig1 ig1Var = ig1.f21399w;
        ig1Var.m6798m("Opening a new session with ID " + str, null);
        Locale locale = Locale.US;
        q02 q02Var = this.f25998f;
        C1372yl c1372yl = this.f26000h;
        String str2 = q02Var.f28122c;
        String str3 = (String) c1372yl.f35308e;
        String str4 = (String) c1372yl.f35309f;
        String str5 = q02Var.m9695c().f20120a;
        byte bM4360e = d55.m4360e(((String) c1372yl.f35306c) != null ? 4 : 1);
        z32 z32Var = (z32) c1372yl.f35311h;
        C1418zu c1418zu = new C1418zu();
        if (str2 == null) {
            xy4.m12782k("Null appIdentifier");
            return;
        }
        c1418zu.f36372a = str2;
        if (str3 == null) {
            xy4.m12782k("Null versionCode");
            return;
        }
        c1418zu.f36373b = str3;
        if (str4 == null) {
            xy4.m12782k("Null versionName");
            return;
        }
        c1418zu.f36374c = str4;
        if (str5 == null) {
            xy4.m12782k("Null installUuid");
            return;
        }
        c1418zu.f36375d = str5;
        c1418zu.f36376e = bM4360e;
        c1418zu.f36377f = z32Var;
        VarHandle.storeStoreFence();
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        boolean zM10698K = se0.m10698K();
        C0505bv c0505bv = new C0505bv();
        if (str6 == null) {
            xy4.m12782k("Null osRelease");
            return;
        }
        c0505bv.f15641a = str6;
        if (str7 == null) {
            xy4.m12782k("Null osCodeName");
            return;
        }
        c0505bv.f15642b = str7;
        c0505bv.f15643c = zM10698K;
        VarHandle.storeStoreFence();
        Context context = this.f25993a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        re0 re0Var = re0.f29201a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            ig1Var.m6801p("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            re0 re0Var2 = (re0) re0.f29202b.get(str8.toLowerCase(locale));
            if (re0Var2 != null) {
                re0Var = re0Var2;
            }
        }
        int iOrdinal = re0Var.ordinal();
        String str9 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM10728j = se0.m10728j(context);
        boolean zM10697J = se0.m10697J();
        int iM10744y = se0.m10744y();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        C0468av c0468av = new C0468av();
        c0468av.f14887a = iOrdinal;
        if (str9 == null) {
            xy4.m12782k("Null model");
            return;
        }
        c0468av.f14888b = str9;
        c0468av.f14889c = iAvailableProcessors;
        c0468av.f14890d = jM10728j;
        c0468av.f14891e = blockCount;
        c0468av.f14892f = zM10697J;
        c0468av.f14893g = iM10744y;
        if (str10 == null) {
            xy4.m12782k("Null manufacturer");
            return;
        }
        c0468av.f14894h = str10;
        if (str11 == null) {
            xy4.m12782k("Null modelClass");
            return;
        }
        c0468av.f14895i = str11;
        VarHandle.storeStoreFence();
        sp0 sp0Var = this.f26002j;
        C1381yu c1381yu = new C1381yu();
        c1381yu.f35524a = c1418zu;
        c1381yu.f35525b = c0505bv;
        c1381yu.f35526c = c0468av;
        VarHandle.storeStoreFence();
        sp0Var.m10891d(str, jCurrentTimeMillis, c1381yu);
        byte b = 2;
        if (bool.booleanValue() && str != null) {
            if1 if1Var = this.f25996d;
            synchronized (((String) if1Var.f21324a)) {
                if1Var.f21324a = str;
                sd2 sd2Var = (sd2) ((AtomicMarkableReference) ((C1126rz) if1Var.f21327d).f29738b).getReference();
                synchronized (sd2Var) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(sd2Var.f30180a));
                }
                List listM9236a = ((oq3) if1Var.f21329f).m9236a();
                yq0 yq0Var = (yq0) ((jp0) if1Var.f21326c).f22482c;
                ow0 ow0Var = new ow0(b);
                ow0Var.f27155b = if1Var;
                ow0Var.f27156c = str;
                ow0Var.f27157d = mapUnmodifiableMap;
                ow0Var.f27158e = listM9236a;
                VarHandle.storeStoreFence();
                yq0Var.m13214a(ow0Var);
            }
        }
        this.f26001i.m13316N(str);
        this.f26004l.m7570a(str);
        C0602e8 c0602e8 = this.f26005m;
        uq0 uq0Var = (uq0) c0602e8.f17867a;
        Charset charset = tq0.f31331a;
        C0736hs c0736hs = new C0736hs();
        c0736hs.f20810a = "19.4.4";
        C1372yl c1372yl2 = uq0Var.f32091c;
        String str12 = (String) c1372yl2.f35304a;
        if (str12 == null) {
            xy4.m12782k("Null gmpAppId");
            return;
        }
        c0736hs.f20811b = str12;
        q02 q02Var2 = uq0Var.f32090b;
        String str13 = q02Var2.m9695c().f20120a;
        if (str13 == null) {
            xy4.m12782k("Null installationUuid");
            return;
        }
        c0736hs.f20813d = str13;
        c0736hs.f20814e = q02Var2.m9695c().f20121b;
        c0736hs.f20815f = q02Var2.m9695c().f20122c;
        String str14 = (String) c1372yl2.f35308e;
        if (str14 == null) {
            xy4.m12782k("Null buildVersion");
            return;
        }
        c0736hs.f20817h = str14;
        String str15 = (String) c1372yl2.f35309f;
        if (str15 == null) {
            xy4.m12782k("Null displayVersion");
            return;
        }
        c0736hs.f20818i = str15;
        c0736hs.f20812c = 4;
        c0736hs.f20822m = (byte) (c0736hs.f20822m | 1);
        C1082qs c1082qs = new C1082qs();
        c1082qs.f28736f = false;
        byte b2 = (byte) (c1082qs.f28743m | 2);
        c1082qs.f28734d = jCurrentTimeMillis;
        c1082qs.f28743m = (byte) (b2 | 1);
        if (str == null) {
            xy4.m12782k("Null identifier");
            return;
        }
        c1082qs.f28732b = str;
        String str16 = uq0.f32088g;
        if (str16 == null) {
            xy4.m12782k("Null generator");
            return;
        }
        c1082qs.f28731a = str16;
        String str17 = q02Var2.f28122c;
        if (str17 == null) {
            xy4.m12782k("Null identifier");
            return;
        }
        String str18 = q02Var2.m9695c().f20120a;
        z32 z32Var2 = (z32) c1372yl2.f35311h;
        String str19 = (String) z32Var2.m13309G().f25810b;
        String str20 = (String) z32Var2.m13309G().f25811c;
        C1156ss c1156ss = new C1156ss();
        c1156ss.f30531a = str17;
        c1156ss.f30532b = str14;
        c1156ss.f30533c = str15;
        c1156ss.f30534d = str18;
        c1156ss.f30535e = str19;
        c1156ss.f30536f = str20;
        VarHandle.storeStoreFence();
        c1082qs.f28737g = c1156ss;
        C1268vt c1268vt = new C1268vt();
        c1268vt.f32845a = 3;
        c1268vt.f32849e = (byte) (c1268vt.f32849e | 1);
        c1268vt.f32846b = str6;
        c1268vt.f32847c = str7;
        c1268vt.f32848d = se0.m10698K();
        c1268vt.f32849e = (byte) (c1268vt.f32849e | 2);
        c1082qs.f28739i = c1268vt.m11986a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        boolean zIsEmpty = TextUtils.isEmpty(str8);
        int iIntValue = 7;
        if (!zIsEmpty && (num = (Integer) uq0.f32087f.get(str8.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM10728j2 = se0.m10728j(uq0Var.f32089a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zM10697J2 = se0.m10697J();
        int iM10744y2 = se0.m10744y();
        C1230us c1230us = new C1230us();
        c1230us.f32130a = iIntValue;
        byte b3 = (byte) (c1230us.f32139j | 1);
        c1230us.f32131b = str9;
        c1230us.f32132c = iAvailableProcessors2;
        c1230us.f32133d = jM10728j2;
        c1230us.f32134e = blockCount2;
        c1230us.f32135f = zM10697J2;
        c1230us.f32136g = iM10744y2;
        c1230us.f32139j = (byte) (((byte) (((byte) (((byte) (((byte) (b3 | 2)) | 4)) | 8)) | 16)) | 32);
        c1230us.f32137h = str10;
        c1230us.f32138i = str11;
        c1082qs.f28740j = c1230us.m11638a();
        c1082qs.f28742l = 3;
        c1082qs.f28743m = (byte) (c1082qs.f28743m | 4);
        c0736hs.f20819j = c1082qs.m10049a();
        C0773is c0773isM6491a = c0736hs.m6491a();
        if1 if1Var2 = ((wq0) c0602e8.f17868b).f33605b;
        sq0 sq0Var = c0773isM6491a.f21732k;
        if (sq0Var == null) {
            ig1Var.m6798m("Could not get session for report", null);
            return;
        }
        String str21 = ((C1119rs) sq0Var).f29560b;
        try {
            wq0.f33601g.getClass();
            wq0.m12371f(if1Var2.m6788c(str21, "report"), vq0.f32797a.m12084h(c0773isM6491a));
            File fileM6788c = if1Var2.m6788c(str21, "start-time");
            long j = ((C1119rs) sq0Var).f29562d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM6788c), wq0.f33599e);
            try {
                outputStreamWriter.write("");
                fileM6788c.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strM13620t = zi4.m13620t("Could not persist report for session ", str21);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strM13620t, e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8809c(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1372yl c1372yl) {
        yq0 yq0Var = (yq0) this.f25997e.f22481b;
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 7);
        runnableC1285w9.f33164b = this;
        runnableC1285w9.f33165c = str;
        VarHandle.storeStoreFence();
        yq0Var.m13214a(runnableC1285w9);
        js1 js1Var = new js1();
        js1Var.f22555a = this;
        VarHandle.storeStoreFence();
        xq0 xq0Var = new xq0();
        xq0Var.f34531a = js1Var;
        xq0Var.f34532b = c1372yl;
        xq0Var.f34533c = uncaughtExceptionHandler;
        xq0Var.f34535e = new AtomicBoolean(false);
        xq0Var.f34534d = this.f26002j;
        VarHandle.storeStoreFence();
        this.f26006n = xq0Var;
        Thread.setDefaultUncaughtExceptionHandler(xq0Var);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8810d(C1372yl c1372yl) throws Throwable {
        jp0.m7209m();
        xq0 xq0Var = this.f26006n;
        if (xq0Var != null && xq0Var.f34535e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            m8807a(true, c1372yl, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m8811e() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f25993a;
        int iM10690C = se0.m10690C(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iM10690C == 0 ? null : context.getResources().getString(iM10690C);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f25992s), 0);
        }
        ClassLoader classLoader = np0.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: f */
    public final nr6 m8812f(long j) {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
            return y62.m12936B(null);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            mp0 mp0Var = new mp0();
            mp0Var.f25095b = this;
            mp0Var.f25094a = j;
            VarHandle.storeStoreFence();
            return y62.m12991r(mp0Var, scheduledThreadPoolExecutor);
        }
    }

    /* JADX INFO: renamed from: g */
    public final nr6 m8813g() {
        ArrayList arrayList = new ArrayList();
        for (File file : if1.m6785f(((File) this.f25999g.f21326c).listFiles(f25991r))) {
            try {
                arrayList.add(m8812f(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return y62.m12976j0(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final void m8814h() {
        try {
            String strM8811e = m8811e();
            if (strM8811e != null) {
                try {
                    this.f25996d.m6789g(strM8811e);
                } catch (IllegalArgumentException e) {
                    Context context = this.f25993a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8815i(nr6 nr6Var) {
        nr6 nr6Var2;
        nr6 nr6VarM7367A;
        li4 li4Var = this.f26007o;
        if1 if1Var = ((wq0) this.f26005m.f17868b).f33605b;
        if (if1.m6785f(((File) if1Var.f21328e).listFiles()).isEmpty() && if1.m6785f(((File) if1Var.f21329f).listFiles()).isEmpty() && if1.m6785f(((File) if1Var.f21330g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            li4Var.m7990c(Boolean.FALSE);
            return;
        }
        ig1 ig1Var = ig1.f21399w;
        ig1Var.m6801p("Crash reports are available to be sent.");
        bt0 bt0Var = this.f25994b;
        if (bt0Var.m3668a()) {
            ig1Var.m6798m("Automatic data collection is enabled. Allowing upload.", null);
            li4Var.m7990c(Boolean.FALSE);
            nr6VarM7367A = y62.m12936B(Boolean.TRUE);
        } else {
            ig1Var.m6798m("Automatic data collection is disabled.", null);
            ig1Var.m6801p("Notifying that unsent reports are available.");
            li4Var.m7990c(Boolean.TRUE);
            synchronized (bt0Var.f15566c) {
                nr6Var2 = ((li4) bt0Var.f15567d).f24059a;
            }
            f70 f70Var = new f70((byte) 3);
            nr6Var2.getClass();
            bu3 bu3Var = mi4.f24958a;
            nr6 nr6Var3 = new nr6();
            nr6Var2.f26058b.m10307g(new a86(bu3Var, f70Var, nr6Var3));
            nr6Var2.m8833q();
            ig1Var.m6798m("Waiting for send/deleteUnsentReports to be called.", null);
            nr6VarM7367A = k43.m7367A(nr6Var3, this.f26008p.f24059a);
        }
        yq0 yq0Var = (yq0) this.f25997e.f22481b;
        nh3 nh3Var = new nh3((byte) 8, false);
        nh3Var.f25811c = this;
        nh3Var.f25810b = nr6Var;
        VarHandle.storeStoreFence();
        nr6VarM7367A.m8827k(yq0Var, nh3Var);
    }
}
