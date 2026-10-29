package p000;

import android.app.Application;
import android.content.Context;
import android.text.format.DateUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wo5 {

    /* JADX INFO: renamed from: j */
    public static wo5 f33564j;

    /* JADX INFO: renamed from: k */
    public static final int[] f33565k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a */
    public Object f33566a;

    /* JADX INFO: renamed from: b */
    public Object f33567b;

    /* JADX INFO: renamed from: c */
    public Object f33568c;

    /* JADX INFO: renamed from: d */
    public Object f33569d;

    /* JADX INFO: renamed from: e */
    public Object f33570e;

    /* JADX INFO: renamed from: f */
    public Object f33571f;

    /* JADX INFO: renamed from: g */
    public Object f33572g;

    /* JADX INFO: renamed from: h */
    public Object f33573h;

    /* JADX INFO: renamed from: i */
    public Object f33574i;

    /* JADX INFO: renamed from: f */
    public static wo5 m12345f(Context context) {
        wo5 wo5VarM12093x;
        synchronized (wo5.class) {
            try {
                wo5VarM12093x = f33564j;
                if (wo5VarM12093x == null) {
                    w42 w42Var = new w42((byte) 28, false);
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    w42Var.f33090b = application;
                    wo5VarM12093x = w42Var.m12093x();
                    f33564j = wo5VarM12093x;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wo5VarM12093x;
    }

    /* JADX INFO: renamed from: a */
    public zj0 m12346a(String str, String str2, Date date, HashMap map) throws xg1, zg1, bh1 {
        String str3;
        try {
            HttpURLConnection httpURLConnectionM4082b = ((ConfigFetchHttpClient) this.f33572g).m4082b();
            ConfigFetchHttpClient configFetchHttpClient = (ConfigFetchHttpClient) this.f33572g;
            HashMap mapM12349d = m12349d();
            String string = ((gk0) this.f33573h).f19824a.getString("last_fetch_etag", null);
            InterfaceC0828ka interfaceC0828ka = (InterfaceC0828ka) ((bi3) this.f33567b).get();
            zj0 zj0VarFetch = configFetchHttpClient.fetch(httpURLConnectionM4082b, str, str2, mapM12349d, string, map, interfaceC0828ka != null ? (Long) ((C0865la) interfaceC0828ka).f23885a.getUserProperties(null, null, true).get("_fot") : null, date, ((gk0) this.f33573h).m6011b());
            wj0 wj0Var = zj0VarFetch.f36144b;
            if (wj0Var != null) {
                gk0 gk0Var = (gk0) this.f33573h;
                long j = wj0Var.f33421f;
                synchronized (gk0Var.f19825b) {
                    gk0Var.f19824a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = zj0VarFetch.f36145c;
            if (str4 != null) {
                gk0 gk0Var2 = (gk0) this.f33573h;
                synchronized (gk0Var2.f19825b) {
                    gk0Var2.f19824a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            ((gk0) this.f33573h).m6013d(0, gk0.f19823f);
            return zj0VarFetch;
        } catch (bh1 e) {
            int i = e.f15266a;
            gk0 gk0Var3 = (gk0) this.f33573h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = gk0Var3.m6010a().f19051a + 1;
                long millis = TimeUnit.MINUTES.toMillis(f33565k[Math.min(i2, 8) - 1]);
                gk0Var3.m6013d(i2, new Date(date.getTime() + (millis / 2) + ((long) ((Random) this.f33570e).nextInt((int) millis))));
            }
            fk0 fk0VarM6010a = gk0Var3.m6010a();
            int i3 = e.f15266a;
            if (fk0VarM6010a.f19051a > 1 || i3 == 429) {
                fk0VarM6010a.f19052b.getTime();
                throw new zg1("Fetch was throttled.");
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new xg1("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            int i4 = e.f15266a;
            bh1 bh1Var = new bh1("Fetch failed: ".concat(str3), e);
            bh1Var.f15266a = i4;
            VarHandle.storeStoreFence();
            throw bh1Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public nr6 m12347b(nr6 nr6Var, long j, HashMap map) {
        nr6 nr6VarM8822f;
        boolean zBefore;
        Executor executor = (Executor) this.f33568c;
        sg1 sg1Var = (sg1) this.f33566a;
        gk0 gk0Var = (gk0) this.f33573h;
        ((ia5) this.f33569d).getClass();
        Date date = new Date(System.currentTimeMillis());
        if (nr6Var.m8826j()) {
            gk0Var.getClass();
            Date date2 = new Date(gk0Var.f19824a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(gk0.f19822e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()));
            }
            if (zBefore) {
                return y62.m12936B(new zj0(2, null, null));
            }
        }
        Date date3 = gk0Var.m6010a().f19052b;
        Date date4 = date.before(date3) ? date3 : null;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000);
            date4.getTime();
            nr6VarM8822f = y62.m12935A(new zg1(str));
        } else {
            rg1 rg1Var = (rg1) sg1Var;
            nr6 nr6VarM10331c = rg1Var.m10331c();
            nr6 nr6VarM10332e = rg1Var.m10332e();
            nr6 nr6VarM12978k0 = y62.m12978k0(nr6VarM10331c, nr6VarM10332e);
            xj0 xj0Var = new xj0();
            xj0Var.f34312a = this;
            xj0Var.f34313b = nr6VarM10331c;
            xj0Var.f34314c = nr6VarM10332e;
            xj0Var.f34315d = date;
            xj0Var.f34316e = map;
            VarHandle.storeStoreFence();
            nr6VarM8822f = nr6VarM12978k0.m8822f(executor, xj0Var);
        }
        C1163sz c1163sz = new C1163sz((byte) 4);
        c1163sz.f30676b = this;
        c1163sz.f30677c = date;
        VarHandle.storeStoreFence();
        return nr6VarM8822f.m8822f(executor, c1163sz);
    }

    /* JADX INFO: renamed from: c */
    public nr6 m12348c(int i) {
        HashMap map = new HashMap((HashMap) this.f33574i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        nr6 nr6VarM11571b = ((uj0) this.f33571f).m11571b();
        Executor executor = (Executor) this.f33568c;
        C1163sz c1163sz = new C1163sz((byte) 3);
        c1163sz.f30676b = this;
        c1163sz.f30677c = map;
        VarHandle.storeStoreFence();
        return nr6VarM11571b.m8822f(executor, c1163sz);
    }

    /* JADX INFO: renamed from: d */
    public HashMap m12349d() {
        HashMap map = new HashMap();
        InterfaceC0828ka interfaceC0828ka = (InterfaceC0828ka) ((bi3) this.f33567b).get();
        if (interfaceC0828ka != null) {
            for (Map.Entry<String, Object> entry : ((C0865la) interfaceC0828ka).f23885a.getUserProperties(null, null, false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x0514  */
    /* JADX WARN: Code duplicated, block: B:141:0x051c  */
    /* JADX WARN: Code duplicated, block: B:142:0x052c  */
    /* JADX WARN: Code duplicated, block: B:144:0x052f  */
    /* JADX WARN: Code duplicated, block: B:147:0x053e  */
    /* JADX WARN: Code duplicated, block: B:172:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x054e A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public void m12350e(C0588dv c0588dv, int i) {
        byte[] bArr;
        jp4 jp4Var;
        pt3 pt3Var;
        long j;
        Iterable iterable;
        C0585ds c0585ds;
        String str;
        C0585ds c0585ds2;
        String str2;
        byte b;
        l70 l70VarM9572i;
        String str3;
        Integer numValueOf;
        C0662fs c0662fs;
        Integer num;
        String str4;
        Iterator it;
        wo5 wo5Var;
        int i2;
        pt3 pt3Var2;
        long j2;
        Iterable iterable2;
        HashMap map;
        Iterator it2;
        String str5;
        wo5 wo5Var2 = this;
        C0588dv c0588dv2 = c0588dv;
        byte[] bArr2 = c0588dv2.f17421b;
        pt3 pt3Var3 = (pt3) wo5Var2.f33571f;
        jp4 jp4VarM11985a = ((vs2) wo5Var2.f33567b).m11985a(c0588dv2.f17420a);
        long jMax = 0;
        while (true) {
            mv4 mv4Var = new mv4((byte) 0);
            mv4Var.f25245b = wo5Var2;
            mv4Var.f25246c = c0588dv2;
            VarHandle.storeStoreFence();
            if (!((Boolean) pt3Var3.m9675k(mv4Var)).booleanValue()) {
                yj0 yj0Var = new yj0();
                yj0Var.f35261b = wo5Var2;
                yj0Var.f35262c = c0588dv2;
                yj0Var.f35260a = jMax;
                VarHandle.storeStoreFence();
                pt3Var3.m9675k(yj0Var);
                return;
            }
            byte b2 = 1;
            mv4 mv4Var2 = new mv4(b2);
            mv4Var2.f25245b = wo5Var2;
            mv4Var2.f25246c = c0588dv2;
            VarHandle.storeStoreFence();
            Iterable iterable3 = (Iterable) pt3Var3.m9675k(mv4Var2);
            if (!iterable3.iterator().hasNext()) {
                return;
            }
            if (jp4VarM11985a == null) {
                se0.m10736q("Uploader", "Unknown backend for %s, deleting event batch for it...", c0588dv2);
                c0585ds2 = new C0585ds(3, -1L);
                bArr = bArr2;
                pt3Var = pt3Var3;
                jp4Var = jp4VarM11985a;
                j = jMax;
                iterable = iterable3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = iterable3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C1010ou) it3.next()).f27102c);
                }
                String str6 = "proto";
                if (bArr2 != null) {
                    pt3 pt3Var4 = (pt3) wo5Var2.f33574i;
                    Objects.requireNonNull(pt3Var4);
                    mt3 mt3Var = new mt3(b2);
                    mt3Var.f25210b = pt3Var4;
                    VarHandle.storeStoreFence();
                    ea0 ea0Var = (ea0) pt3Var3.m9675k(mt3Var);
                    C0940nb c0940nb = new C0940nb(b2);
                    c0940nb.f25610g = new HashMap();
                    c0940nb.f25608e = Long.valueOf(((ja0) wo5Var2.f33572g).mo5609j());
                    c0940nb.f25609f = Long.valueOf(((ja0) wo5Var2.f33573h).mo5609j());
                    c0940nb.f25605b = "GDT_CLIENT_METRICS";
                    j81 j81VarM7046a = j81.m7046a("proto");
                    ea0Var.getClass();
                    z91 z91Var = lh3.f24035a;
                    z91Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        z91Var.m13457d(ea0Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c0940nb.f25607d = new f81(j81VarM7046a, byteArrayOutputStream.toByteArray());
                    arrayList.add(((m70) jp4VarM11985a).m8213a(c0940nb.m8669e()));
                }
                m70 m70Var = (m70) jp4VarM11985a;
                String str7 = "CctTransportBackend";
                HashMap map2 = new HashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    C0467au c0467au = (C0467au) obj;
                    byte[] bArr3 = bArr2;
                    String str8 = c0467au.f14865a;
                    if (map2.containsKey(str8)) {
                        ((List) map2.get(str8)).add(c0467au);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c0467au);
                        map2.put(str8, arrayList2);
                    }
                    bArr2 = bArr3;
                    jp4VarM11985a = jp4VarM11985a;
                }
                bArr = bArr2;
                jp4Var = jp4VarM11985a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = map2.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry = (Map.Entry) it4.next();
                    C0467au c0467au2 = (C0467au) ((List) entry.getValue()).get(0);
                    li3 li3Var = li3.f24057a;
                    long jMo5609j = m70Var.f24702f.mo5609j();
                    pt3 pt3Var5 = pt3Var3;
                    Iterator it5 = it4;
                    long jMo5609j2 = m70Var.f24701e.mo5609j();
                    Integer numValueOf2 = Integer.valueOf(c0467au2.m3309b("sdk-version"));
                    String strM3308a = c0467au2.m3308a("model");
                    String str9 = str6;
                    String strM3308a2 = c0467au2.m3308a("hardware");
                    long j3 = jMax;
                    String strM3308a3 = c0467au2.m3308a("device");
                    String strM3308a4 = c0467au2.m3308a("product");
                    String strM3308a5 = c0467au2.m3308a("os-uild");
                    Iterable iterable4 = iterable3;
                    String strM3308a6 = c0467au2.m3308a("manufacturer");
                    String strM3308a7 = c0467au2.m3308a("fingerprint");
                    String str10 = str7;
                    String strM3308a8 = c0467au2.m3308a("country");
                    m70 m70Var2 = m70Var;
                    String strM3308a9 = c0467au2.m3308a("locale");
                    ArrayList arrayList4 = arrayList3;
                    String strM3308a10 = c0467au2.m3308a("mcc_mnc");
                    String strM3308a11 = c0467au2.m3308a("application_build");
                    C0549cs c0549cs = new C0549cs();
                    c0549cs.f16404a = numValueOf2;
                    c0549cs.f16405b = strM3308a;
                    c0549cs.f16406c = strM3308a2;
                    c0549cs.f16407d = strM3308a3;
                    c0549cs.f16408e = strM3308a4;
                    c0549cs.f16409f = strM3308a5;
                    c0549cs.f16410g = strM3308a6;
                    c0549cs.f16411h = strM3308a7;
                    c0549cs.f16412i = strM3308a9;
                    c0549cs.f16413j = strM3308a8;
                    c0549cs.f16414k = strM3308a10;
                    c0549cs.f16415l = strM3308a11;
                    VarHandle.storeStoreFence();
                    C0662fs c0662fs2 = new C0662fs();
                    c0662fs2.f19246a = c0549cs;
                    VarHandle.storeStoreFence();
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str3 = null;
                    } catch (NumberFormatException unused2) {
                        str3 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it6 = ((List) entry.getValue()).iterator();
                    while (it6.hasNext()) {
                        C0467au c0467au3 = (C0467au) it6.next();
                        f81 f81Var = c0467au3.f14867c;
                        byte[] bArr4 = c0467au3.f14874j;
                        j81 j81Var = f81Var.f18834a;
                        byte[] bArr5 = f81Var.f18835b;
                        if (j81Var.equals(j81.m7046a(str9))) {
                            wo5Var = new wo5();
                            wo5Var.f33570e = bArr5;
                        } else {
                            if (j81Var.equals(j81.m7046a("json"))) {
                                String str11 = new String(bArr5, Charset.forName("UTF-8"));
                                wo5 wo5Var3 = new wo5();
                                wo5Var3.f33571f = str11;
                                wo5Var = wo5Var3;
                            } else {
                                c0662fs = c0662fs2;
                                num = numValueOf;
                                str4 = str3;
                                it = it6;
                                if (Log.isLoggable("TRuntime.CctTransportBackend", 5)) {
                                    Log.w("TRuntime.CctTransportBackend", "Received event of unsupported encoding " + j81Var + ". Skipping...");
                                }
                            }
                            it6 = it;
                            str3 = str4;
                            numValueOf = num;
                            c0662fs2 = c0662fs;
                        }
                        wo5Var.f33566a = Long.valueOf(c0467au3.f14868d);
                        wo5Var.f33569d = Long.valueOf(c0467au3.f14869e);
                        String str12 = (String) c0467au3.f14870f.get("tz-offset");
                        wo5Var.f33572g = Long.valueOf(str12 == null ? 0L : Long.valueOf(str12).longValue());
                        m03 m03Var = (m03) m03.f24517a.get(c0467au3.m3309b("net-type"));
                        l03 l03Var = (l03) l03.f23666a.get(c0467au3.m3309b("mobile-subtype"));
                        C0959nu c0959nu = new C0959nu();
                        c0959nu.f26083a = m03Var;
                        c0959nu.f26084b = l03Var;
                        VarHandle.storeStoreFence();
                        wo5Var.f33573h = c0959nu;
                        Integer num2 = c0467au3.f14866b;
                        if (num2 != null) {
                            wo5Var.f33567b = num2;
                        }
                        Integer num3 = c0467au3.f14871g;
                        if (num3 != null) {
                            C0587du c0587du = new C0587du();
                            c0587du.f17384a = num3;
                            VarHandle.storeStoreFence();
                            C0626eu c0626eu = new C0626eu();
                            c0626eu.f18482a = c0587du;
                            VarHandle.storeStoreFence();
                            mf0 mf0Var = mf0.f24854a;
                            C0699gs c0699gs = new C0699gs();
                            c0699gs.f20084a = c0626eu;
                            VarHandle.storeStoreFence();
                            wo5Var.f33568c = c0699gs;
                        }
                        byte[] bArr6 = c0467au3.f14873i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            if (bArr4 == null) {
                                bArr4 = null;
                            }
                            C0551cu c0551cu = new C0551cu();
                            c0551cu.f16477a = bArr6;
                            c0551cu.f16478b = bArr4;
                            VarHandle.storeStoreFence();
                            wo5Var.f33574i = c0551cu;
                        }
                        String strConcat = ((Long) wo5Var.f33566a) == null ? " eventTimeMs" : "";
                        if (((Long) wo5Var.f33569d) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) wo5Var.f33572g) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            C1077qn.m9989o("Missing required properties:".concat(strConcat));
                            return;
                        }
                        long jLongValue = ((Long) wo5Var.f33566a).longValue();
                        Integer num4 = (Integer) wo5Var.f33567b;
                        C0699gs c0699gs2 = (C0699gs) wo5Var.f33568c;
                        long jLongValue2 = ((Long) wo5Var.f33569d).longValue();
                        byte[] bArr7 = (byte[]) wo5Var.f33570e;
                        it = it6;
                        String str13 = (String) wo5Var.f33571f;
                        str4 = str3;
                        num = numValueOf;
                        long jLongValue3 = ((Long) wo5Var.f33572g).longValue();
                        c0662fs = c0662fs2;
                        C0959nu c0959nu2 = (C0959nu) wo5Var.f33573h;
                        C0551cu c0551cu2 = (C0551cu) wo5Var.f33574i;
                        C0848ku c0848ku = new C0848ku();
                        c0848ku.f23497a = jLongValue;
                        c0848ku.f23498b = num4;
                        c0848ku.f23499c = c0699gs2;
                        c0848ku.f23500d = jLongValue2;
                        c0848ku.f23501e = bArr7;
                        c0848ku.f23502f = str13;
                        c0848ku.f23503g = jLongValue3;
                        c0848ku.f23504h = c0959nu2;
                        c0848ku.f23505i = c0551cu2;
                        VarHandle.storeStoreFence();
                        arrayList5.add(c0848ku);
                        it6 = it;
                        str3 = str4;
                        numValueOf = num;
                        c0662fs2 = c0662fs;
                    }
                    C0662fs c0662fs3 = c0662fs2;
                    C0885lu c0885lu = new C0885lu();
                    c0885lu.f24366a = jMo5609j;
                    c0885lu.f24367b = jMo5609j2;
                    c0885lu.f24368c = c0662fs3;
                    c0885lu.f24369d = numValueOf;
                    c0885lu.f24370e = str3;
                    c0885lu.f24371f = arrayList5;
                    VarHandle.storeStoreFence();
                    arrayList4.add(c0885lu);
                    arrayList3 = arrayList4;
                    pt3Var3 = pt3Var5;
                    it4 = it5;
                    str6 = str9;
                    jMax = j3;
                    iterable3 = iterable4;
                    str7 = str10;
                    m70Var = m70Var2;
                }
                m70 m70Var3 = m70Var;
                pt3Var = pt3Var3;
                String str14 = str7;
                j = jMax;
                iterable = iterable3;
                C0623es c0623es = new C0623es();
                c0623es.f18426a = arrayList3;
                VarHandle.storeStoreFence();
                URL urlM8212b = m70Var3.f24700d;
                if (bArr != null) {
                    try {
                        v50 v50VarM11747a = v50.m11747a(bArr);
                        str = v50VarM11747a.f32414b;
                        if (str == null) {
                            str = null;
                        }
                        String str15 = v50VarM11747a.f32413a;
                        if (str15 != null) {
                            urlM8212b = m70.m8212b(str15);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c0585ds = new C0585ds(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    jp0 jp0Var = new jp0(urlM8212b, c0623es, str);
                    C1040pn c1040pn = new C1040pn((byte) 1);
                    c1040pn.f27754b = m70Var3;
                    VarHandle.storeStoreFence();
                    int i4 = 5;
                    while (true) {
                        l70VarM9572i = c1040pn.m9572i(jp0Var);
                        URL url = l70VarM9572i.f23828b;
                        if (url != null) {
                            str2 = str14;
                            try {
                                se0.m10736q(str2, "Following redirect to: %s", url);
                                jp0Var = new jp0(url, (C0623es) jp0Var.f22483d, (String) jp0Var.f22482c);
                            } catch (IOException e) {
                                e = e;
                                se0.m10739t(str2, "Could not make request to the backend", e);
                                b = 2;
                                c0585ds2 = new C0585ds(2, -1L);
                                i2 = c0585ds2.f17311a;
                                if (i2 == b) {
                                    sx0 sx0Var = new sx0(b);
                                    sx0Var.f30624b = this;
                                    sx0Var.f30627e = iterable;
                                    sx0Var.f30626d = c0588dv;
                                    sx0Var.f30625c = j;
                                    VarHandle.storeStoreFence();
                                    pt3Var.m9675k(sx0Var);
                                    ((jp0) this.f33569d).m7224N(c0588dv, i + 1, true);
                                    return;
                                }
                                wo5Var2 = this;
                                pt3Var2 = pt3Var;
                                j2 = j;
                                iterable2 = iterable;
                                C1163sz c1163sz = new C1163sz((byte) 15);
                                c1163sz.f30676b = wo5Var2;
                                c1163sz.f30677c = iterable2;
                                VarHandle.storeStoreFence();
                                pt3Var2.m9675k(c1163sz);
                                if (i2 == 1) {
                                    jMax = Math.max(j2, c0585ds2.f17312b);
                                    if (bArr != null) {
                                        C1040pn c1040pn2 = new C1040pn((byte) 18);
                                        c1040pn2.f27754b = wo5Var2;
                                        VarHandle.storeStoreFence();
                                        pt3Var2.m9675k(c1040pn2);
                                    }
                                } else {
                                    if (i2 == 4) {
                                        map = new HashMap();
                                        it2 = iterable2.iterator();
                                        while (it2.hasNext()) {
                                            str5 = ((C1010ou) it2.next()).f27102c.f14865a;
                                            if (map.containsKey(str5)) {
                                                map.put(str5, Integer.valueOf(((Integer) map.get(str5)).intValue() + 1));
                                            } else {
                                                map.put(str5, 1);
                                            }
                                        }
                                        C1163sz c1163sz2 = new C1163sz((byte) 16);
                                        c1163sz2.f30676b = wo5Var2;
                                        c1163sz2.f30677c = map;
                                        VarHandle.storeStoreFence();
                                        pt3Var2.m9675k(c1163sz2);
                                    }
                                    jMax = j2;
                                }
                                c0588dv2 = c0588dv;
                                pt3Var3 = pt3Var2;
                                bArr2 = bArr;
                                jp4VarM11985a = jp4Var;
                            }
                        } else {
                            str2 = str14;
                            jp0Var = null;
                        }
                        if (jp0Var == null || (i4 = i4 - 1) < 1) {
                            break;
                            break;
                        }
                        str14 = str2;
                    }
                    int i5 = l70VarM9572i.f23827a;
                    if (i5 == 200) {
                        c0585ds2 = new C0585ds(1, l70VarM9572i.f23829c);
                    } else {
                        if (i5 >= 500 || i5 == 404) {
                            c0585ds = new C0585ds(2, -1L);
                        } else if (i5 == 400) {
                            try {
                                c0585ds = new C0585ds(4, -1L);
                            } catch (IOException e2) {
                                e = e2;
                                se0.m10739t(str2, "Could not make request to the backend", e);
                                b = 2;
                                c0585ds2 = new C0585ds(2, -1L);
                            }
                        } else {
                            c0585ds = new C0585ds(3, -1L);
                        }
                        c0585ds2 = c0585ds;
                    }
                } catch (IOException e3) {
                    e = e3;
                    str2 = str14;
                }
            }
            b = 2;
            i2 = c0585ds2.f17311a;
            if (i2 == b) {
                sx0 sx0Var2 = new sx0(b);
                sx0Var2.f30624b = this;
                sx0Var2.f30627e = iterable;
                sx0Var2.f30626d = c0588dv;
                sx0Var2.f30625c = j;
                VarHandle.storeStoreFence();
                pt3Var.m9675k(sx0Var2);
                ((jp0) this.f33569d).m7224N(c0588dv, i + 1, true);
                return;
            }
            wo5Var2 = this;
            pt3Var2 = pt3Var;
            j2 = j;
            iterable2 = iterable;
            C1163sz c1163sz3 = new C1163sz((byte) 15);
            c1163sz3.f30676b = wo5Var2;
            c1163sz3.f30677c = iterable2;
            VarHandle.storeStoreFence();
            pt3Var2.m9675k(c1163sz3);
            if (i2 == 1) {
                jMax = Math.max(j2, c0585ds2.f17312b);
                if (bArr != null) {
                    C1040pn c1040pn3 = new C1040pn((byte) 18);
                    c1040pn3.f27754b = wo5Var2;
                    VarHandle.storeStoreFence();
                    pt3Var2.m9675k(c1040pn3);
                }
            } else {
                if (i2 == 4) {
                    map = new HashMap();
                    it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        str5 = ((C1010ou) it2.next()).f27102c.f14865a;
                        if (map.containsKey(str5)) {
                            map.put(str5, 1);
                        } else {
                            map.put(str5, Integer.valueOf(((Integer) map.get(str5)).intValue() + 1));
                        }
                    }
                    C1163sz c1163sz4 = new C1163sz((byte) 16);
                    c1163sz4.f30676b = wo5Var2;
                    c1163sz4.f30677c = map;
                    VarHandle.storeStoreFence();
                    pt3Var2.m9675k(c1163sz4);
                }
                jMax = j2;
            }
            c0588dv2 = c0588dv;
            pt3Var3 = pt3Var2;
            bArr2 = bArr;
            jp4VarM11985a = jp4Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public ww5 m12351g(wo5 wo5Var) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f33566a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) wo5Var.f33566a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    jw5 jw5Var = (jw5) wo5Var.f33567b;
                    if (jw5Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        byte b = jw5Var.f22706c;
                        if (b != 1) {
                            jsonWriter.name("os_type");
                            int i = b - 1;
                            if (i == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = jw5Var.f22704a;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = jw5Var.f22705b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) wo5Var.f33568c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) wo5Var.f33569d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) wo5Var.f33570e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    C1283w7 c1283w7 = (C1283w7) wo5Var.f33571f;
                    if (c1283w7 != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) c1283w7.f33126b;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) c1283w7.f33127c;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) c1283w7.f33128d;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<lw5> list = (List) c1283w7.f33129e;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (lw5 lw5Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = lw5Var.f24425a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = lw5Var.f24426b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = lw5Var.f24427c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = lw5Var.f24428d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    tt2 tt2Var = (tt2) wo5Var.f33572g;
                    if (tt2Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) tt2Var.f31428b;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) tt2Var.f31429c;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) tt2Var.f31430d;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((aj5) wo5Var.f33573h) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) wo5Var.f33574i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((dw5) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        ww5 ww5VarM12432a = ww5.m12432a(new JsonReader(new StringReader(headerField)));
                        ww5VarM12432a.f33808a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return ww5VarM12432a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            ww5 ww5VarM12432a2 = ww5.m12432a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return ww5VarM12432a2;
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (SocketTimeoutException e) {
            throw new n56(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new n56(2, "Error making request.", e2);
        }
    }
}
