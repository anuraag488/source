package p000;

import android.app.BroadcastOptions;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt5 implements pv4, sm3, j16, ha6, cl0, rg6, bn6, xm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15595a;

    /* JADX INFO: renamed from: b */
    public Object f15596b;

    public /* synthetic */ bt5(byte b) {
        this.f15595a = b;
    }

    /* JADX INFO: renamed from: g */
    public static bt5 m3674g(String str) {
        rc6 rc6VarM12655e = (TextUtils.isEmpty(str) || str.length() > 1) ? rc6.UNINITIALIZED : xc6.m12655e(str.charAt(0));
        bt5 bt5Var = new bt5((byte) 6);
        bt5Var.f15596b = rc6VarM12655e;
        VarHandle.storeStoreFence();
        return bt5Var;
    }

    @Override // p000.bn6
    /* JADX INFO: renamed from: a */
    public void mo3640a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        qm6 qm6Var = (qm6) this.f15596b;
        if (zIsEmpty) {
            oa6 oa6Var = qm6Var.f28602l;
            if (oa6Var != null) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12505b(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        ea6 ea6VarMo9020c = qm6Var.mo9020c();
        yb6 yb6Var = new yb6((byte) 8);
        yb6Var.f35104b = str;
        yb6Var.f35105c = str2;
        yb6Var.f35106d = bundle;
        yb6Var.f35107e = this;
        VarHandle.storeStoreFence();
        ea6VarMo9020c.m5033D(yb6Var);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0201  */
    @Override // p000.sm3
    public void accept(Object obj, Object obj2) {
        boolean z;
        int i;
        long j;
        long j2;
        boolean z2;
        ed1 ed1Var;
        ed1 ed1Var2;
        ed1 ed1Var3;
        li4 li4Var = (li4) obj2;
        t06 t06Var = (t06) obj;
        cs0 cs0Var = (cs0) this.f15596b;
        ed1[] availableFeatures = t06Var.getAvailableFeatures();
        if (availableFeatures != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= availableFeatures.length) {
                    ed1Var3 = null;
                    break;
                }
                ed1Var3 = availableFeatures[i2];
                if ("location_updates_with_callback".equals(ed1Var3.f18013d)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (ed1Var3 != null && ed1Var3.m5091b() >= 1) {
                fr6 fr6Var = (fr6) t06Var.getService();
                l16 l16Var = new l16(4, null, new zz5(li4Var), null, null);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(fr6Var.f23221c);
                ov5.m9314b(parcelObtain, cs0Var);
                ov5.m9314b(parcelObtain, l16Var);
                Parcel parcelM7551H = fr6Var.m7551H(parcelObtain, 92);
                IBinder strongBinder = parcelM7551H.readStrongBinder();
                int i3 = hz1.f20950j;
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                }
                parcelM7551H.recycle();
                return;
            }
        }
        ed1[] availableFeatures2 = t06Var.getAvailableFeatures();
        if (availableFeatures2 != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= availableFeatures2.length) {
                    ed1Var2 = null;
                    break;
                }
                ed1Var2 = availableFeatures2[i4];
                if ("get_current_location".equals(ed1Var2.f18013d)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (ed1Var2 != null && ed1Var2.m5091b() >= 2) {
                fr6 fr6Var2 = (fr6) t06Var.getService();
                zz5 zz5Var = new zz5(li4Var);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(fr6Var2.f23221c);
                ov5.m9314b(parcelObtain2, cs0Var);
                parcelObtain2.writeStrongBinder(zz5Var);
                Parcel parcelM7551H2 = fr6Var2.m7551H(parcelObtain2, 87);
                IBinder strongBinder2 = parcelM7551H2.readStrongBinder();
                int i5 = hz1.f20950j;
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                }
                parcelM7551H2.recycle();
                return;
            }
        }
        yg3 yg3Var = new yg3((byte) 17);
        yg3Var.f35215b = li4Var;
        yg3Var.f35216c = t06Var;
        VarHandle.storeStoreFence();
        hm2 hm2Var = new hm2();
        hm2Var.f20697a = yg3Var;
        y42.m12851X("GetCurrentLocation");
        hm2Var.f20698b = new gm2(yg3Var);
        VarHandle.storeStoreFence();
        Objects.requireNonNull(hm2Var.f20698b);
        pq3 pq3Var = new pq3((byte) 12);
        pq3Var.f27896b = hm2Var;
        pq3Var.f27897c = li4Var;
        VarHandle.storeStoreFence();
        li4 li4Var2 = new li4();
        int i6 = cs0Var.f16418f;
        long jMin = 0;
        boolean z3 = true;
        y42.m12848U("intervalMillis must be greater than or equal to 0", 0 >= 0);
        d46.m4341b(i6);
        long j3 = cs0Var.f16419g;
        y42.m12848U("durationMillis must be greater than 0", j3 > 0);
        int i7 = cs0Var.f16417e;
        int i8 = 2;
        if (i7 == 0 || i7 == 1) {
            z = true;
            i = i7;
        } else if (i7 == 2) {
            z = true;
            i = 2;
        } else {
            i = i7;
            z = false;
        }
        Object[] objArr = {Integer.valueOf(i)};
        if (!z) {
            throw new IllegalArgumentException(String.format("granularity %d must be a Granularity.GRANULARITY_* constant", objArr));
        }
        long j4 = cs0Var.f16416d;
        y42.m12848U("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j4 == -1 || j4 >= 0);
        boolean z4 = cs0Var.f16420h;
        int i9 = cs0Var.f16421i;
        if (i9 == 0 || i9 == 1) {
            i8 = i9;
        } else if (i9 != 2) {
            i8 = i9;
            z3 = false;
        }
        Object[] objArr2 = {Integer.valueOf(i8)};
        if (!z3) {
            throw new IllegalArgumentException(String.format("throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2));
        }
        WorkSource workSource = cs0Var.f16422j;
        if (jMin == -1 || i6 == 105) {
            j2 = 0;
            j = jMin;
        } else {
            j = jMin;
            jMin = Math.min(j, j);
            j2 = 0;
        }
        LocationRequest locationRequest = new LocationRequest(i6, j, jMin, Math.max(j2, j), Long.MAX_VALUE, j3, Integer.MAX_VALUE, 0.0f, true, j4 == -1 ? j : j4, i7, i9, z4, new WorkSource(workSource), null);
        gm2 gm2Var = hm2Var.f20698b;
        Objects.requireNonNull(gm2Var);
        ed1[] availableFeatures3 = t06Var.getAvailableFeatures();
        if (availableFeatures3 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= availableFeatures3.length) {
                    ed1Var = null;
                    break;
                }
                ed1Var = availableFeatures3[i10];
                if ("location_updates_with_callback".equals(ed1Var.f18013d)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (ed1Var != null && ed1Var.m5091b() >= 1) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        synchronized (t06Var.f30713d) {
            try {
                m06 m06Var = (m06) t06Var.f30713d.get(gm2Var);
                if (m06Var != null && !z2) {
                    m06Var.f24523j.getClass();
                    throw new IllegalStateException();
                }
                m06 m06Var2 = new m06("com.google.android.gms.location.ILocationCallback", (byte) 5);
                m06Var2.f24523j = pq3Var;
                VarHandle.storeStoreFence();
                t06Var.f30713d.put(gm2Var, m06Var2);
                if (z2) {
                    fr6 fr6Var3 = (fr6) t06Var.getService();
                    String str = "GetCurrentLocation@" + System.identityHashCode(gm2Var.f19880a);
                    if (m06Var == null) {
                        m06Var = null;
                    }
                    l16 l16Var2 = new l16(2, m06Var, m06Var2, null, str);
                    uz5 uz5Var = new uz5(null, li4Var2);
                    Parcel parcelObtain3 = Parcel.obtain();
                    parcelObtain3.writeInterfaceToken(fr6Var3.f23221c);
                    ov5.m9314b(parcelObtain3, l16Var2);
                    ov5.m9314b(parcelObtain3, locationRequest);
                    parcelObtain3.writeStrongBinder(uz5Var);
                    fr6Var3.m7553J(parcelObtain3, 88);
                } else {
                    fr6 fr6Var4 = (fr6) t06Var.getService();
                    q16 q16Var = new q16(1, new n16(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, m06Var2, null, new lz5(li4Var2, m06Var2), "GetCurrentLocation@" + System.identityHashCode(gm2Var.f19880a));
                    Parcel parcelObtain4 = Parcel.obtain();
                    parcelObtain4.writeInterfaceToken(fr6Var4.f23221c);
                    ov5.m9314b(parcelObtain4, q16Var);
                    fr6Var4.m7553J(parcelObtain4, 59);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nr6 nr6Var = li4Var2.f24059a;
        rr5 rr5Var = new rr5((byte) 8);
        rr5Var.f29555b = li4Var;
        VarHandle.storeStoreFence();
        nr6Var.m8818b(rr5Var);
    }

    /* JADX INFO: renamed from: b */
    public Object m3675b() {
        hd6 hd6Var = (hd6) this.f15596b;
        ContentResolver contentResolver = hd6Var.f20499a;
        Uri uri = hd6Var.f20500b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, hd6.f20498i, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map c0805jo = count <= 256 ? new C0805jo(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c0805jo.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c0805jo;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException e) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // p000.rg6
    /* JADX INFO: renamed from: c */
    public void mo3676c(int i, Throwable th, byte[] bArr) {
        d76 d76Var;
        d76 d76Var2;
        int i2 = i;
        oa6 oa6Var = (oa6) this.f15596b;
        d76 d76Var3 = oa6Var.f26514f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                s86 s86Var = oa6Var.f26513e;
                oa6.m9014j(s86Var);
                s86Var.f29979R.m6281b(true);
                if (bArr != null || bArr.length == 0) {
                    oa6.m9016l(d76Var3);
                    d76Var3.f16842q.m12504a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        oa6.m9016l(d76Var3);
                        d76Var3.f16842q.m12504a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    dn6 dn6Var = oa6Var.f26517i;
                    oa6.m9014j(dn6Var);
                    oa6 oa6Var2 = (oa6) dn6Var.f36084a;
                    if (TextUtils.isEmpty(strOptString)) {
                        d76Var2 = d76Var3;
                    } else {
                        Context context = oa6Var2.f26509a;
                        d76Var2 = d76Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                oa6Var.f26521m.m8301B("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = oa6Var2.f26509a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    d76 d76Var4 = ((oa6) dn6Var.f36084a).f26514f;
                                    oa6.m9016l(d76Var4);
                                    d76Var4.f16835j.m12505b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            d76Var = d76Var2;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12505b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    oa6.m9016l(d76Var2);
                    d76Var = d76Var2;
                    try {
                        d76Var.f16838m.m12507d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        oa6.m9016l(d76Var);
                        d76Var.f16835j.m12505b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    d76Var = d76Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                s86 s86Var2 = oa6Var.f26513e;
                oa6.m9014j(s86Var2);
                s86Var2.f29979R.m6281b(true);
                if (bArr != null) {
                }
                oa6.m9016l(d76Var3);
                d76Var3.f16842q.m12504a("Deferred Deep Link response empty.");
                return;
            }
        }
        oa6.m9016l(d76Var3);
        d76Var3.f16838m.m12506c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    /* JADX INFO: renamed from: d */
    public void m3677d(int i, String str, List list, boolean z, boolean z2) {
        x66 x66Var;
        oa6 oa6Var = (oa6) ((n96) this.f15596b).f36084a;
        int i2 = i - 1;
        if (i2 == 0) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            x66Var = d76Var.f16842q;
        } else if (i2 != 1) {
            if (i2 == 3) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                x66Var = d76Var2.f16831L;
            } else if (i2 != 4) {
                d76 d76Var3 = oa6Var.f26514f;
                oa6.m9016l(d76Var3);
                x66Var = d76Var3.f16841p;
            } else if (z) {
                d76 d76Var4 = oa6Var.f26514f;
                oa6.m9016l(d76Var4);
                x66Var = d76Var4.f16839n;
            } else if (z2) {
                d76 d76Var5 = oa6Var.f26514f;
                oa6.m9016l(d76Var5);
                x66Var = d76Var5.f16838m;
            } else {
                d76 d76Var6 = oa6Var.f26514f;
                oa6.m9016l(d76Var6);
                x66Var = d76Var6.f16840o;
            }
        } else if (z) {
            d76 d76Var7 = oa6Var.f26514f;
            oa6.m9016l(d76Var7);
            x66Var = d76Var7.f16836k;
        } else if (z2) {
            d76 d76Var8 = oa6Var.f26514f;
            oa6.m9016l(d76Var8);
            x66Var = d76Var8.f16835j;
        } else {
            d76 d76Var9 = oa6Var.f26514f;
            oa6.m9016l(d76Var9);
            x66Var = d76Var9.f16837l;
        }
        int size = list.size();
        if (size == 1) {
            x66Var.m12505b(list.get(0), str);
            return;
        }
        if (size == 2) {
            x66Var.m12506c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            x66Var.m12504a(str);
        } else {
            x66Var.m12507d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // p000.pv4
    /* JADX INFO: renamed from: e */
    public void mo3678e(ts5 ts5Var) {
        ((AtomicReference) this.f15596b).set(ts5Var);
    }

    @Override // p000.j16
    /* JADX INFO: renamed from: f */
    public void mo3680f() throws IOException {
        List list;
        byte b = 10;
        byte b2 = 4;
        switch (this.f15595a) {
            case 2:
                zx5 zx5Var = (zx5) this.f15596b;
                u06 u06Var = (u06) zx5Var;
                if (u06Var.f31584k == null) {
                    i16 i16Var = u06Var.f31586m;
                    i16Var.f21028l = 10;
                    HttpURLConnection httpURLConnection = u06Var.f31582i;
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.connect();
                    i16Var.f21028l = 12;
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    u06Var.f31585l = outputStream;
                    u06Var.f31584k = Channels.newChannel(outputStream);
                }
                zx5Var.f36449a.set(0);
                rr5 rr5Var = new rr5(b2);
                rr5Var.f29555b = zx5Var;
                VarHandle.storeStoreFence();
                zx5Var.m13836c(rr5Var, "readFromProvider");
                break;
            case 3:
                ((cr5) this.f15596b).close();
                break;
            case 4:
                i16 i16Var2 = (i16) this.f15596b;
                HttpURLConnection httpURLConnection2 = i16Var2.f21033q;
                r06 r06Var = i16Var2.f21017a;
                if (httpURLConnection2 != null) {
                    ArrayList arrayList = new ArrayList();
                    String headerField = "http/1.1";
                    int i = 0;
                    while (true) {
                        String headerFieldKey = i16Var2.f21033q.getHeaderFieldKey(i);
                        if (headerFieldKey == null) {
                            int responseCode = i16Var2.f21033q.getResponseCode();
                            ArrayList arrayList2 = new ArrayList(i16Var2.f21021e);
                            String responseMessage = i16Var2.f21033q.getResponseMessage();
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                            m26 m26Var = new m26();
                            m26Var.f24600a = Collections.unmodifiableList(arrayList2);
                            m26Var.f24601b = responseCode;
                            m26Var.f24602c = responseMessage;
                            List listUnmodifiableList2 = Collections.unmodifiableList(listUnmodifiableList);
                            i26 i26Var = new i26();
                            i26Var.f21085a = listUnmodifiableList2;
                            VarHandle.storeStoreFence();
                            m26Var.f24606g = i26Var;
                            m26Var.f24603d = headerField;
                            m26Var.f24604e = "";
                            m26Var.f24605f = new AtomicLong(0L);
                            VarHandle.storeStoreFence();
                            if (responseCode >= 300 && responseCode < 400 && (list = (List) i26Var.getAsMap().get("location")) != null) {
                                String str = (String) list.get(0);
                                yn3 yn3Var = new yn3(b);
                                yn3Var.f35360b = i16Var2;
                                yn3Var.f35361c = str;
                                yn3Var.f35362d = m26Var;
                                VarHandle.storeStoreFence();
                                i16Var2.m6560e(1, 2, yn3Var);
                            } else {
                                i16Var2.f21031o = m26Var;
                                i16Var2.m6559d();
                                HttpURLConnection httpURLConnection3 = i16Var2.f21033q;
                                byte b3 = 5;
                                if (responseCode < 400) {
                                    i16Var2.f21030n = kw5.m7673a(httpURLConnection3.getInputStream());
                                    r06Var.getClass();
                                    bt5 bt5Var = new bt5(b3);
                                    bt5Var.f15596b = r06Var;
                                    VarHandle.storeStoreFence();
                                    r06Var.m10176a(bt5Var, "onResponseStarted");
                                } else {
                                    InputStream errorStream = httpURLConnection3.getErrorStream();
                                    i16Var2.f21030n = errorStream == null ? null : kw5.m7673a(errorStream);
                                    r06Var.getClass();
                                    bt5 bt5Var2 = new bt5(b3);
                                    bt5Var2.f15596b = r06Var;
                                    VarHandle.storeStoreFence();
                                    r06Var.m10176a(bt5Var2, "onResponseStarted");
                                }
                            }
                        } else {
                            if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                                headerField = i16Var2.f21033q.getHeaderField(i);
                            }
                            if (!headerFieldKey.startsWith("X-Android")) {
                                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, i16Var2.f21033q.getHeaderField(i)));
                            }
                            i++;
                        }
                        break;
                    }
                }
                break;
            default:
                r06 r06Var2 = (r06) this.f15596b;
                i16 i16Var3 = r06Var2.f28940d;
                if (i16Var3.f21022f.compareAndSet(1, 4)) {
                    r06Var2.f28937a.onResponseStarted(i16Var3, i16Var3.f21031o);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) {
        switch (this.f15595a) {
            case 16:
                tf6 tf6Var = (tf6) this.f15596b;
                if (nr6Var.m8826j() || nr6Var.f26060d) {
                    return nr6Var;
                }
                Exception excM8823g = nr6Var.m8823g();
                if (!(excM8823g instanceof C1334xk)) {
                    return nr6Var;
                }
                int i = ((C1334xk) excM8823g).f34324a.f16228d;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    return ((tf6) tf6Var.f31129c).mo3636a();
                }
                if (i == 43000) {
                    return y62.m12935A(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                return i != 15 ? nr6Var : y62.m12935A(new Exception("The operation to get app set ID timed out. Please try again later."));
            default:
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) this.f15596b);
                return y62.m12936B(arrayList);
        }
    }

    @Override // p000.cl0
    /* JADX INFO: renamed from: i */
    public void mo3141i() {
        dc6 dc6Var = (dc6) this.f15596b;
        synchronized (dc6Var.f16988e) {
            dc6Var.f16991h = false;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3682j(int i, Object obj, gk6 gk6Var) {
        ef6 ef6Var = (ef6) obj;
        ng6 ng6Var = (ng6) this.f15596b;
        ng6Var.m8724m((i << 3) | 2);
        ng6Var.m8724m(ef6Var.mo5119b(gk6Var));
        gk6Var.mo6023a(ef6Var, ng6Var.f25783a);
    }

    /* JADX INFO: renamed from: k */
    public void m3683k(int i, Object obj, gk6 gk6Var) {
        ng6 ng6Var = (ng6) this.f15596b;
        ng6Var.m8714c(i, 3);
        gk6Var.mo6023a((ef6) obj, ng6Var.f25783a);
        ng6Var.m8714c(i, 4);
    }

    @Override // p000.ha6
    /* JADX INFO: renamed from: f */
    public FileChannel mo3679f() {
        return new FileInputStream((File) this.f15596b).getChannel();
    }
}
