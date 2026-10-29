package p000;

import ads_mobile_sdk.C0313rh;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uo5 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32035a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32036b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32037c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32038d;

    public /* synthetic */ uo5(byte b) {
        this.f32035a = b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0298 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m11602a() throws Throwable {
        C0795je c0795je;
        int i;
        nq5 nq5Var;
        ?? r4;
        ?? r5;
        sv5 sv5Var;
        ?? r20;
        C0927mz c0927mz = (C0927mz) this.f32036b;
        C1015oz c1015oz = (C1015oz) this.f32037c;
        wd3 wd3Var = (wd3) this.f32038d;
        Exception exc = null;
        if (!c0927mz.m8438G(g06.f19478b)) {
            f00 f00Var = rz5.f29767j;
            c0927mz.m8450u(2, 7, f00Var);
            uu5 uu5Var = sv5.f30597b;
            mw5 mw5Var = mw5.f25264e;
            cf0 cf0Var = c1015oz.f27240a;
            tg3 tg3Var = new tg3();
            tg3Var.f31144a = f00Var;
            tg3Var.f31145b = mw5Var;
            VarHandle.storeStoreFence();
            cf0Var.m4989U(tg3Var);
            return null;
        }
        if (!c0927mz.f25330r) {
            qv5.m10140h("BillingClient", "Querying product details is not supported.");
            f00 f00Var2 = rz5.f29773p;
            c0927mz.m8450u(20, 7, f00Var2);
            uu5 uu5Var2 = sv5.f30597b;
            mw5 mw5Var2 = mw5.f25264e;
            cf0 cf0Var2 = c1015oz.f27240a;
            tg3 tg3Var2 = new tg3();
            tg3Var2.f31144a = f00Var2;
            tg3Var2.f31145b = mw5Var2;
            VarHandle.storeStoreFence();
            cf0Var2.m4989U(tg3Var2);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        String str = ((ui3) ((sv5) wd3Var.f33259b).get(0)).f31894b;
        sv5 sv5Var2 = (sv5) wd3Var.f33259b;
        int size = sv5Var2.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 20;
            ?? arrayList3 = new ArrayList(sv5Var2.subList(i2, i3 > size ? size : i3));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (?? r13 = z; r13 < size2; r13++) {
                arrayList4.add(((ui3) arrayList3.get(r13)).f31893a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            bundle.putString("playBillingLibraryVersion", c0927mz.f25315c);
            try {
                synchronized (c0927mz.f25313a) {
                    try {
                        nq5Var = c0927mz.f25321i;
                    } catch (Throwable th) {
                        th = th;
                        i = 43;
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (nq5Var == null) {
                    c0795je = c0927mz.m8443j(rz5.f29767j, C0313rh.f10790h1, "Service has been reset to null.", exc);
                } else {
                    if (c0927mz.f25331s) {
                        c0927mz.f25337y.getClass();
                    }
                    c0927mz.m8447n();
                    c0927mz.m8447n();
                    c0927mz.m8447n();
                    c0927mz.m8447n();
                    dn5 dn5Var = new dn5();
                    dn5Var.f17220a = z;
                    VarHandle.storeStoreFence();
                    int i4 = size;
                    ?? r6 = arrayList3;
                    i = 43;
                    try {
                        Bundle bundleM5287V = ((eq5) nq5Var).m5287V(true != c0927mz.f25332t ? 17 : 20, c0927mz.f25319g.getPackageName(), str, bundle, qv5.m10136d(c0927mz.f25316d, arrayList3, dn5Var, c0927mz.f25311D.longValue()));
                        if (bundleM5287V == null) {
                            c0795je = c0927mz.m8443j(rz5.f29774q, 44, "queryProductDetailsAsync got empty product details response.", null);
                        } else if (bundleM5287V.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleM5287V.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                c0795je = c0927mz.m8443j(rz5.f29774q, 46, "queryProductDetailsAsync got null response list", null);
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = stringArrayList.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    try {
                                        sg3 sg3Var = new sg3(stringArrayList.get(i5));
                                        qv5.m10139g("BillingClient", "Got product details: ".concat(sg3Var.toString()));
                                        arrayList5.add(sg3Var);
                                    } catch (JSONException e) {
                                        c0795je = c0927mz.m8443j(rz5.m10511a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                    }
                                }
                                ArrayList<String> stringArrayList2 = bundleM5287V.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                new ArrayList();
                                try {
                                    ArrayList arrayList6 = new ArrayList();
                                    if (stringArrayList2 != null) {
                                        int size4 = stringArrayList2.size();
                                        int i6 = 0;
                                        while (i6 < size4) {
                                            String str2 = stringArrayList2.get(i6);
                                            i6++;
                                            bu4 bu4Var = new bu4(str2);
                                            qv5.m10139g("BillingClient", "Got unfetchedProduct: ".concat(bu4Var.toString()));
                                            arrayList6.add(bu4Var);
                                        }
                                    } else {
                                        int size5 = r6.size();
                                        int i7 = 0;
                                        while (i7 < size5) {
                                            Object obj = r4.get(i7);
                                            i7++;
                                            ui3 ui3Var = (ui3) obj;
                                            int size6 = arrayList5.size();
                                            int i8 = 0;
                                            while (true) {
                                                if (i8 >= size6) {
                                                    r4 = r6;
                                                    r5 = r4;
                                                    sv5Var = sv5Var2;
                                                    r20 = r5;
                                                    arrayList6.add(new bu4(new JSONObject().put("productId", ui3Var.f31893a).put("type", ui3Var.f31894b).put("statusCode", 0).toString()));
                                                    break;
                                                }
                                                Object obj2 = arrayList5.get(i8);
                                                i8++;
                                                sg3 sg3Var2 = (sg3) obj2;
                                                sv5Var = sv5Var2;
                                                r20 = r5;
                                                if (ui3Var.f31893a.equals(sg3Var2.f30244c) && ui3Var.f31894b.equals(sg3Var2.f30245d)) {
                                                    r4 = r6;
                                                    r5 = r4;
                                                    break;
                                                }
                                                r4 = r6;
                                                r5 = r4;
                                                sv5Var2 = sv5Var;
                                                r5 = r20;
                                            }
                                            sv5Var2 = sv5Var;
                                            r4 = r20;
                                        }
                                        r4 = r6;
                                    }
                                    sv5 sv5Var3 = sv5Var2;
                                    arrayList.addAll(arrayList5);
                                    arrayList2.addAll(arrayList6);
                                    i2 = i3;
                                    size = i4;
                                    sv5Var2 = sv5Var3;
                                    exc = null;
                                    z = false;
                                } catch (JSONException e2) {
                                    c0795je = c0927mz.m8443j(rz5.m10511a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                                }
                            }
                        } else {
                            int iM10133a = qv5.m10133a("BillingClient", bundleM5287V);
                            String strM10138f = qv5.m10138f("BillingClient", bundleM5287V);
                            c0795je = iM10133a != 0 ? c0927mz.m8443j(rz5.m10511a(iM10133a, strM10138f), 23, c75.m3877i(iM10133a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c0927mz.m8443j(rz5.m10511a(6, strM10138f), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                        }
                    } catch (DeadObjectException e3) {
                        e = e3;
                        c0795je = c0927mz.m8443j(rz5.f29767j, i, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    } catch (Exception e4) {
                        e = e4;
                        c0795je = c0927mz.m8443j(rz5.f29765h, i, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    }
                }
            } catch (DeadObjectException e5) {
                e = e5;
                i = 43;
            } catch (Exception e6) {
                e = e6;
                i = 43;
            }
            f00 f00VarM10511a = rz5.m10511a(c0795je.f22193b, (String) c0795je.f22195d);
            ArrayList arrayList7 = (ArrayList) c0795je.f22194c;
            cf0 cf0Var3 = c1015oz.f27240a;
            tg3 tg3Var3 = new tg3();
            tg3Var3.f31144a = f00VarM10511a;
            tg3Var3.f31145b = arrayList7;
            VarHandle.storeStoreFence();
            cf0Var3.m4989U(tg3Var3);
            return null;
        }
        c0795je = new C0795je(0, "", arrayList, arrayList2);
        f00 f00VarM10511a2 = rz5.m10511a(c0795je.f22193b, (String) c0795je.f22195d);
        ArrayList arrayList8 = (ArrayList) c0795je.f22194c;
        cf0 cf0Var4 = c1015oz.f27240a;
        tg3 tg3Var4 = new tg3();
        tg3Var4.f31144a = f00VarM10511a2;
        tg3Var4.f31145b = arrayList8;
        VarHandle.storeStoreFence();
        cf0Var4.m4989U(tg3Var4);
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x023f */
    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:101:0x0264  */
    /* JADX WARN: Code duplicated, block: B:213:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0200  */
    /* JADX WARN: Code duplicated, block: B:81:0x0208  */
    /* JADX WARN: Code duplicated, block: B:85:0x022e A[LOOP:0: B:15:0x0089->B:85:0x022e, LOOP_END] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() throws Throwable {
        Bundle bundleM10135c;
        nq5 nq5Var;
        nq5 nq5Var2;
        nq5 nq5Var3;
        int i;
        String strM10138f;
        Exception exc;
        pq3 pq3VarM8449t;
        List list;
        C1015oz c1015oz;
        f00 f00Var;
        nq5 nq5Var4;
        int i2;
        Bundle bundleM5286U;
        f00 f00VarM4828e;
        int i3;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        int i4;
        boolean z;
        int i5;
        JSONObject jSONObject;
        byte b = this.f32035a;
        int i6 = C0313rh.f10790h1;
        Exception exc2 = null;
        switch (b) {
            case 0:
                C0927mz c0927mz = (C0927mz) this.f32036b;
                String str = (String) this.f32037c;
                String str2 = (String) this.f32038d;
                try {
                    synchronized (c0927mz.f25313a) {
                        nq5Var = c0927mz.f25321i;
                        break;
                    }
                    if (nq5Var == null) {
                        return qv5.m10135c(rz5.f29767j, C0313rh.f10790h1);
                    }
                    return ((eq5) nq5Var).m5283R(c0927mz.f25319g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    f00 f00Var2 = rz5.f29767j;
                    String strM7756a = kz5.m7756a(e);
                    bundleM10135c = qv5.m10135c(f00Var2, 5);
                    if (strM7756a != null) {
                        bundleM10135c.putString("ADDITIONAL_LOG_DETAILS", strM7756a);
                    }
                    return bundleM10135c;
                } catch (Exception e2) {
                    f00 f00Var3 = rz5.f29765h;
                    String strM7756a2 = kz5.m7756a(e2);
                    bundleM10135c = qv5.m10135c(f00Var3, 5);
                    if (strM7756a2 != null) {
                        bundleM10135c.putString("ADDITIONAL_LOG_DETAILS", strM7756a2);
                    }
                    return bundleM10135c;
                }
            case 1:
                C0927mz c0927mz2 = (C0927mz) this.f32036b;
                C0964nz c0964nz = (C0964nz) this.f32037c;
                C0973o7 c0973o7 = (C0973o7) this.f32038d;
                try {
                    if (!c0927mz2.m8438G(g06.f19478b)) {
                        f00 f00Var4 = rz5.f29767j;
                        c0927mz2.m8450u(2, 3, f00Var4);
                        c0964nz.m8899a(f00Var4);
                        return null;
                    }
                    if (TextUtils.isEmpty(c0973o7.f26402b)) {
                        qv5.m10140h("BillingClient", "Please provide a valid purchase token.");
                        f00 f00Var5 = rz5.f29764g;
                        c0927mz2.m8450u(26, 3, f00Var5);
                        c0964nz.m8899a(f00Var5);
                        return null;
                    }
                    if (!c0927mz2.f25326n) {
                        f00 f00Var6 = rz5.f29758a;
                        c0927mz2.m8450u(27, 3, f00Var6);
                        c0964nz.m8899a(f00Var6);
                        return null;
                    }
                    synchronized (c0927mz2.f25313a) {
                        nq5Var2 = c0927mz2.f25321i;
                        break;
                    }
                    if (nq5Var2 == null) {
                        c0927mz2.m8448p(c0964nz, rz5.f29767j, C0313rh.f10790h1, null);
                    } else {
                        String packageName = c0927mz2.f25319g.getPackageName();
                        String str3 = c0973o7.f26402b;
                        String str4 = c0927mz2.f25316d;
                        long jLongValue = c0927mz2.f25311D.longValue();
                        int i7 = qv5.f28836a;
                        Bundle bundle = new Bundle();
                        qv5.m10134b(bundle, str4, jLongValue);
                        Bundle bundleM5281P = ((eq5) nq5Var2).m5281P(packageName, str3, bundle);
                        c0964nz.m8899a(rz5.m10511a(qv5.m10133a("BillingClient", bundleM5281P), qv5.m10138f("BillingClient", bundleM5281P)));
                    }
                    return null;
                } catch (DeadObjectException e3) {
                    c0927mz2.m8448p(c0964nz, rz5.f29767j, 28, e3);
                } catch (Exception e4) {
                    c0927mz2.m8448p(c0964nz, rz5.f29765h, 28, e4);
                }
                break;
            case 2:
                return Boolean.valueOf(((wy5) this.f32036b).mo12134b((String) this.f32037c, (JSONObject) this.f32038d));
            case 3:
                C0927mz c0927mz3 = (C0927mz) this.f32036b;
                C0964nz c0964nz2 = (C0964nz) this.f32037c;
                C0973o7 c0973o8 = (C0973o7) this.f32038d;
                if (c0927mz3.m8438G(g06.f19478b)) {
                    String str5 = c0973o8.f26402b;
                    try {
                        qv5.m10139g("BillingClient", "Consuming purchase with token: " + str5);
                        synchronized (c0927mz3.f25313a) {
                            nq5Var3 = c0927mz3.f25321i;
                            break;
                        }
                        if (nq5Var3 == null) {
                            c0927mz3.m8455z(c0964nz2, str5, rz5.f29767j, C0313rh.f10790h1, "Service has been reset to null.", null);
                        } else {
                            boolean z2 = c0927mz3.f25326n;
                            Context context = c0927mz3.f25319g;
                            if (z2) {
                                String packageName2 = context.getPackageName();
                                boolean z3 = c0927mz3.f25326n;
                                String str6 = c0927mz3.f25316d;
                                long jLongValue2 = c0927mz3.f25311D.longValue();
                                Bundle bundle2 = new Bundle();
                                if (z3) {
                                    qv5.m10134b(bundle2, str6, jLongValue2);
                                }
                                Bundle bundleM5282Q = ((eq5) nq5Var3).m5282Q(packageName2, str5, bundle2);
                                i = bundleM5282Q.getInt("RESPONSE_CODE");
                                strM10138f = qv5.m10138f("BillingClient", bundleM5282Q);
                            } else {
                                String packageName3 = context.getPackageName();
                                eq5 eq5Var = (eq5) nq5Var3;
                                Parcel parcelM7555L = eq5Var.m7555L();
                                parcelM7555L.writeInt(3);
                                parcelM7555L.writeString(packageName3);
                                parcelM7555L.writeString(str5);
                                Parcel parcelM7556M = eq5Var.m7556M(parcelM7555L, 5);
                                i = parcelM7556M.readInt();
                                parcelM7556M.recycle();
                                strM10138f = "";
                            }
                            f00 f00VarM10511a = rz5.m10511a(i, strM10138f);
                            if (i == 0) {
                                qv5.m10139g("BillingClient", "Successfully consumed purchase.");
                                c0964nz2.m8900b(f00VarM10511a, str5);
                            } else {
                                c0927mz3.m8455z(c0964nz2, str5, f00VarM10511a, 23, c75.m3877i(i, "Error consuming purchase with token. Response code: "), null);
                            }
                        }
                    } catch (DeadObjectException e5) {
                        c0927mz3.m8455z(c0964nz2, str5, rz5.f29767j, 29, "Error consuming purchase!", e5);
                    } catch (Exception e6) {
                        c0927mz3.m8455z(c0964nz2, str5, rz5.f29765h, 29, "Error consuming purchase!", e6);
                    }
                } else {
                    f00 f00Var7 = rz5.f29767j;
                    c0927mz3.m8450u(2, 4, f00Var7);
                    c0964nz2.m8900b(f00Var7, c0973o8.f26402b);
                }
                return null;
            case 4:
                return m11602a();
            default:
                C0927mz c0927mz4 = (C0927mz) this.f32036b;
                int i8 = 9;
                if (c0927mz4.m8438G(g06.f19478b)) {
                    String str7 = (String) this.f32037c;
                    if (!TextUtils.isEmpty(str7)) {
                        qv5.m10139g("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str7)));
                        ArrayList arrayList = new ArrayList();
                        boolean z4 = c0927mz4.f25326n;
                        c0927mz4.f25337y.getClass();
                        long jLongValue3 = c0927mz4.f25311D.longValue();
                        Bundle bundle3 = new Bundle();
                        qv5.m10134b(bundle3, c0927mz4.f25316d, jLongValue3);
                        if (z4) {
                            bundle3.putBoolean("enablePendingPurchases", true);
                        }
                        String string = null;
                        while (true) {
                            try {
                                synchronized (c0927mz4.f25313a) {
                                    try {
                                        nq5Var4 = c0927mz4.f25321i;
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        exc = exc2;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (DeadObjectException e7) {
                                                e = e7;
                                                pq3VarM8449t = c0927mz4.m8449t(rz5.f29767j, 52, "Got exception trying to get purchases try to reconnect", e);
                                                list = (List) pq3VarM8449t.f27896b;
                                                c1015oz = (C1015oz) this.f32038d;
                                                f00Var = (f00) pq3VarM8449t.f27897c;
                                                if (list != null) {
                                                    c1015oz.m9337a(f00Var, list);
                                                    return exc;
                                                }
                                                uu5 uu5Var = sv5.f30597b;
                                                c1015oz.m9337a(f00Var, mw5.f25264e);
                                                return exc;
                                            } catch (Exception e8) {
                                                e = e8;
                                                pq3VarM8449t = c0927mz4.m8449t(rz5.f29765h, 52, "Got exception trying to get purchases try to reconnect", e);
                                                list = (List) pq3VarM8449t.f27896b;
                                                c1015oz = (C1015oz) this.f32038d;
                                                f00Var = (f00) pq3VarM8449t.f27897c;
                                                if (list != null) {
                                                    c1015oz.m9337a(f00Var, list);
                                                    return exc;
                                                }
                                                uu5 uu5Var2 = sv5.f30597b;
                                                c1015oz.m9337a(f00Var, mw5.f25264e);
                                                return exc;
                                            }
                                        }
                                    }
                                }
                                if (nq5Var4 == null) {
                                    pq3VarM8449t = c0927mz4.m8449t(rz5.f29767j, i6, "Service has been reset to null", exc2);
                                    break;
                                } else {
                                    if (c0927mz4.f25326n) {
                                        if (c0927mz4.f25335w) {
                                            i2 = 26;
                                        } else if (c0927mz4.f25334v) {
                                            i2 = 24;
                                        } else {
                                            i2 = c0927mz4.f25331s ? 19 : i8;
                                        }
                                        bundleM5286U = ((eq5) nq5Var4).m5286U(i2, c0927mz4.f25319g.getPackageName(), str7, string, bundle3);
                                    } else {
                                        bundleM5286U = ((eq5) nq5Var4).m5285T(c0927mz4.f25319g.getPackageName(), str7, string);
                                    }
                                    f00 f00Var8 = rz5.f29765h;
                                    if (bundleM5286U == null) {
                                        qv5.m10140h("BillingClient", "getPurchase() got null owned items list");
                                        i3 = 54;
                                    } else {
                                        int iM10133a = qv5.m10133a("BillingClient", bundleM5286U);
                                        String strM10138f2 = qv5.m10138f("BillingClient", bundleM5286U);
                                        e00 e00VarM5438a = f00.m5438a();
                                        e00VarM5438a.f17552a = iM10133a;
                                        e00VarM5438a.f17554c = strM10138f2;
                                        f00VarM4828e = e00VarM5438a.m4828e();
                                        if (iM10133a != 0) {
                                            qv5.m10140h("BillingClient", "getPurchase() failed. Response code: " + iM10133a);
                                            i3 = 23;
                                        } else if (bundleM5286U.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleM5286U.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleM5286U.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                            ArrayList<String> stringArrayList4 = bundleM5286U.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                            ArrayList<String> stringArrayList5 = bundleM5286U.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                            ArrayList<String> stringArrayList6 = bundleM5286U.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                            if (stringArrayList4 == null) {
                                                qv5.m10140h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                                i3 = 56;
                                            } else if (stringArrayList5 == null) {
                                                qv5.m10140h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                                i3 = 57;
                                            } else if (stringArrayList6 == null) {
                                                qv5.m10140h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                                i3 = 58;
                                            } else {
                                                f00VarM4828e = rz5.f29766i;
                                                i3 = 1;
                                            }
                                        } else {
                                            qv5.m10140h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                                            i3 = 55;
                                        }
                                        if (f00VarM4828e != rz5.f29766i) {
                                            pq3VarM8449t = c0927mz4.m8449t(f00VarM4828e, i3, "Purchase bundle invalid", exc2);
                                        } else {
                                            stringArrayList = bundleM5286U.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                            stringArrayList2 = bundleM5286U.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                            stringArrayList3 = bundleM5286U.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                            i4 = 0;
                                            z = false;
                                            while (i4 < stringArrayList2.size()) {
                                                String str8 = stringArrayList2.get(i4);
                                                exc = exc2;
                                                String str9 = stringArrayList3.get(i4);
                                                ArrayList<String> arrayList2 = stringArrayList;
                                                qv5.m10139g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i4))));
                                                try {
                                                    ji3 ji3Var = new ji3(str8, str9);
                                                    c0927mz4.f25308A.isEmpty();
                                                    jSONObject = ji3Var.f22316c;
                                                    if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                                        qv5.m10140h("BillingClient", "BUG: empty/null token!");
                                                        z = true;
                                                    }
                                                    arrayList.add(ji3Var);
                                                    i4++;
                                                    exc2 = exc;
                                                    stringArrayList = arrayList2;
                                                } catch (JSONException e9) {
                                                    pq3VarM8449t = c0927mz4.m8449t(rz5.f29765h, 51, "Got an exception trying to decode the purchase!", e9);
                                                }
                                            }
                                            exc = exc2;
                                            if (z) {
                                                i5 = 9;
                                                c0927mz4.m8450u(26, 9, f00Var8);
                                            } else {
                                                i5 = 9;
                                            }
                                            string = bundleM5286U.getString("INAPP_CONTINUATION_TOKEN");
                                            qv5.m10139g("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                                            if (TextUtils.isEmpty(string)) {
                                                pq3VarM8449t = new pq3(rz5.f29766i, arrayList);
                                            } else {
                                                i8 = i5;
                                                exc2 = exc;
                                                i6 = C0313rh.f10790h1;
                                            }
                                        }
                                    }
                                    f00VarM4828e = f00Var8;
                                    if (f00VarM4828e != rz5.f29766i) {
                                        pq3VarM8449t = c0927mz4.m8449t(f00VarM4828e, i3, "Purchase bundle invalid", exc2);
                                    } else {
                                        stringArrayList = bundleM5286U.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                        stringArrayList2 = bundleM5286U.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                        stringArrayList3 = bundleM5286U.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                        i4 = 0;
                                        z = false;
                                        while (i4 < stringArrayList2.size()) {
                                            String str10 = stringArrayList2.get(i4);
                                            exc = exc2;
                                            String str11 = stringArrayList3.get(i4);
                                            ArrayList<String> arrayList3 = stringArrayList;
                                            qv5.m10139g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i4))));
                                            ji3 ji3Var2 = new ji3(str10, str11);
                                            c0927mz4.f25308A.isEmpty();
                                            jSONObject = ji3Var2.f22316c;
                                            if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                                qv5.m10140h("BillingClient", "BUG: empty/null token!");
                                                z = true;
                                            }
                                            arrayList.add(ji3Var2);
                                            i4++;
                                            exc2 = exc;
                                            stringArrayList = arrayList3;
                                        }
                                        exc = exc2;
                                        if (z) {
                                            i5 = 9;
                                            c0927mz4.m8450u(26, 9, f00Var8);
                                        } else {
                                            i5 = 9;
                                        }
                                        string = bundleM5286U.getString("INAPP_CONTINUATION_TOKEN");
                                        qv5.m10139g("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                                        if (TextUtils.isEmpty(string)) {
                                            pq3VarM8449t = new pq3(rz5.f29766i, arrayList);
                                        } else {
                                            i8 = i5;
                                            exc2 = exc;
                                            i6 = C0313rh.f10790h1;
                                        }
                                    }
                                }
                                exc = exc2;
                            } catch (DeadObjectException e10) {
                                e = e10;
                                exc = exc2;
                            } catch (Exception e11) {
                                e = e11;
                                exc = exc2;
                            }
                        }
                        list = (List) pq3VarM8449t.f27896b;
                        c1015oz = (C1015oz) this.f32038d;
                        f00Var = (f00) pq3VarM8449t.f27897c;
                        if (list != null) {
                            c1015oz.m9337a(f00Var, list);
                            return exc;
                        }
                        uu5 uu5Var3 = sv5.f30597b;
                        c1015oz.m9337a(f00Var, mw5.f25264e);
                        return exc;
                    }
                    qv5.m10140h("BillingClient", "Please provide a valid product type.");
                    f00 f00Var9 = rz5.f29762e;
                    c0927mz4.m8450u(50, 9, f00Var9);
                    C1015oz c1015oz2 = (C1015oz) this.f32038d;
                    uu5 uu5Var4 = sv5.f30597b;
                    c1015oz2.m9337a(f00Var9, mw5.f25264e);
                } else {
                    f00 f00Var10 = rz5.f29767j;
                    c0927mz4.m8450u(2, 9, f00Var10);
                    C1015oz c1015oz3 = (C1015oz) this.f32038d;
                    uu5 uu5Var5 = sv5.f30597b;
                    c1015oz3.m9337a(f00Var10, mw5.f25264e);
                }
                return null;
        }
    }
}
