package p000;

import ads_mobile_sdk.C0045ba;
import ads_mobile_sdk.C0062ca;
import ads_mobile_sdk.C0132ga;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0294qd;
import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.C0311rd;
import ads_mobile_sdk.C0391wo;
import ads_mobile_sdk.dg3;
import ads_mobile_sdk.eh2;
import ads_mobile_sdk.mz3;
import ads_mobile_sdk.sy0;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.RegistrationPolicyAlwaysRegister;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p62 implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ p62 f27399b = new p62(9);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ p62 f27400c = new p62(10);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27401a;

    public /* synthetic */ p62(byte b) {
        this.f27401a = b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:104:0x01df  */
    /* JADX WARN: Code duplicated, block: B:112:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:224:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Point point;
        HashSet hashSet;
        KeyguardManager keyguardManager;
        String str;
        Activity activity;
        Boolean bool;
        WeakHashMap weakHashMap;
        HashSet hashSet2;
        String str2;
        ArrayList arrayList;
        int size;
        int i;
        sy0 sy0Var;
        View view;
        C0294qd c0294qd;
        switch (this.f27401a) {
            case 0:
                return;
            case 1:
                if (eh2.f3003b != null) {
                    point = new Point(0, 0);
                    eh2.f3003b.getDefaultDisplay().getRealSize(point);
                } else {
                    point = null;
                }
                if (point != null) {
                    eh2.f3004c = point;
                    return;
                }
                return;
            case 2:
                String str3 = "OMIDLIB";
                mz3 mz3Var = mz3.f7438g;
                mz3Var.getClass();
                ArrayList arrayList2 = mz3Var.f7443a;
                C0200km c0200km = mz3Var.f7445c;
                C0200km c0200km2 = mz3Var.f7447e;
                C0311rd c0311rd = mz3Var.f7446d;
                mz3Var.f7444b.clear();
                Iterator it = Collections.unmodifiableCollection(C0062ca.f1872c.f1874b).iterator();
                while (it.hasNext()) {
                    ((C0045ba) it.next()).getClass();
                }
                System.nanoTime();
                HashMap map = c0311rd.f10657g;
                HashMap map2 = c0311rd.f10657g;
                HashMap map3 = c0311rd.f10651a;
                HashSet hashSet3 = c0311rd.f10654d;
                HashSet hashSet4 = c0311rd.f10658h;
                HashMap map4 = c0311rd.f10652b;
                HashMap map5 = c0311rd.f10653c;
                HashSet hashSet5 = c0311rd.f10655e;
                HashSet<String> hashSet6 = c0311rd.f10656f;
                WeakHashMap weakHashMap2 = c0311rd.f10659i;
                C0062ca c0062ca = C0062ca.f1872c;
                if (c0062ca != null) {
                    Iterator it2 = Collections.unmodifiableCollection(c0062ca.f1874b).iterator();
                    while (it2.hasNext()) {
                        it2 = it2;
                        C0045ba c0045ba = (C0045ba) it2.next();
                        c0311rd = c0311rd;
                        fz4 fz4Var = c0045ba.f1081c;
                        String str4 = c0045ba.f1085g;
                        mz3Var = mz3Var;
                        View view2 = (View) fz4Var.get();
                        c0200km2 = c0200km2;
                        if (c0045ba.f1083e && !c0045ba.f1084f) {
                            if (view2 != null) {
                                Context context = view2.getContext();
                                String str5 = str3;
                                while (true) {
                                    if (!(context instanceof ContextWrapper)) {
                                        activity = null;
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                                boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                                if (zIsInPictureInPictureMode) {
                                    hashSet4.add(str4);
                                }
                                boolean z = zIsInPictureInPictureMode;
                                if (view2.isAttachedToWindow()) {
                                    if (view2.hasWindowFocus()) {
                                        weakHashMap2.remove(view2);
                                        bool = Boolean.FALSE;
                                    } else if (weakHashMap2.containsKey(view2)) {
                                        bool = (Boolean) weakHashMap2.get(view2);
                                    } else {
                                        bool = Boolean.FALSE;
                                        weakHashMap2.put(view2, bool);
                                    }
                                    if (!bool.booleanValue() || z) {
                                        HashSet hashSet7 = new HashSet();
                                        weakHashMap = weakHashMap2;
                                        View view3 = view2;
                                        while (true) {
                                            if (view3 == null) {
                                                hashSet2 = hashSet4;
                                                hashSet3.addAll(hashSet7);
                                                str2 = null;
                                            } else {
                                                String strM6612d = i25.m6612d(view3);
                                                if (strM6612d != null) {
                                                    str2 = strM6612d;
                                                } else {
                                                    hashSet7.add(view3);
                                                    Object parent = view3.getParent();
                                                    hashSet4 = hashSet4;
                                                    view3 = parent instanceof View ? (View) parent : null;
                                                }
                                            }
                                        }
                                        if (str2 == null) {
                                            hashSet5.add(str4);
                                            map3.put(view2, str4);
                                            arrayList = c0045ba.f1080b.f12509a;
                                            size = arrayList.size();
                                            i = 0;
                                            while (i < size) {
                                                Object obj = arrayList.get(i);
                                                i++;
                                                sy0Var = (sy0) obj;
                                                view = (View) sy0Var.f11798a.get();
                                                if (view != null) {
                                                    c0294qd = (C0294qd) map4.get(view);
                                                    if (c0294qd != null) {
                                                        c0294qd.f8922b.add(str4);
                                                    } else {
                                                        C0294qd c0294qd2 = new C0294qd();
                                                        ArrayList arrayList3 = arrayList;
                                                        ArrayList arrayList4 = new ArrayList();
                                                        c0294qd2.f8922b = arrayList4;
                                                        c0294qd2.f8921a = sy0Var;
                                                        arrayList4.add(str4);
                                                        VarHandle.storeStoreFence();
                                                        map4.put(view, c0294qd2);
                                                        arrayList = arrayList3;
                                                    }
                                                }
                                            }
                                        } else if (str2 != "noWindowFocus") {
                                            hashSet6.add(str4);
                                            map5.put(str4, view2);
                                            map.put(str4, str2);
                                        }
                                        str3 = str5;
                                        weakHashMap2 = weakHashMap;
                                        hashSet4 = hashSet2;
                                    } else {
                                        weakHashMap = weakHashMap2;
                                        str2 = "noWindowFocus";
                                    }
                                } else {
                                    str2 = "notAttached";
                                    weakHashMap = weakHashMap2;
                                }
                                hashSet2 = hashSet4;
                                if (str2 == null) {
                                    hashSet5.add(str4);
                                    map3.put(view2, str4);
                                    arrayList = c0045ba.f1080b.f12509a;
                                    size = arrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        Object obj2 = arrayList.get(i);
                                        i++;
                                        sy0Var = (sy0) obj2;
                                        view = (View) sy0Var.f11798a.get();
                                        if (view != null) {
                                            c0294qd = (C0294qd) map4.get(view);
                                            if (c0294qd != null) {
                                                c0294qd.f8922b.add(str4);
                                            } else {
                                                C0294qd c0294qd3 = new C0294qd();
                                                ArrayList arrayList5 = arrayList;
                                                ArrayList arrayList6 = new ArrayList();
                                                c0294qd3.f8922b = arrayList6;
                                                c0294qd3.f8921a = sy0Var;
                                                arrayList6.add(str4);
                                                VarHandle.storeStoreFence();
                                                map4.put(view, c0294qd3);
                                                arrayList = arrayList5;
                                            }
                                        }
                                    }
                                } else if (str2 != "noWindowFocus") {
                                    hashSet6.add(str4);
                                    map5.put(str4, view2);
                                    map.put(str4, str2);
                                }
                                str3 = str5;
                                weakHashMap2 = weakHashMap;
                                hashSet4 = hashSet2;
                            } else {
                                hashSet6.add(str4);
                                map.put(str4, "noAdView");
                                weakHashMap2 = weakHashMap2;
                            }
                        }
                    }
                }
                String str6 = str3;
                mz3 mz3Var2 = mz3Var;
                C0200km c0200km3 = c0200km2;
                HashSet hashSet8 = hashSet4;
                C0311rd c0311rd2 = c0311rd;
                HashMap map6 = map4;
                long jNanoTime = System.nanoTime();
                C0391wo c0391wo = (C0391wo) c0200km.f6401b;
                if (hashSet6.size() > 0) {
                    for (String str7 : hashSet6) {
                        HashSet hashSet9 = hashSet3;
                        JSONObject jSONObjectM2618a = c0391wo.m2618a((View) null);
                        View view4 = (View) map5.get(str7);
                        C0310ra c0310ra = (C0310ra) c0200km.f6400a;
                        HashMap map7 = map6;
                        String str8 = (String) map2.get(str7);
                        if (str8 != null) {
                            JSONObject jSONObjectM2093a = c0310ra.m2093a(view4);
                            try {
                                jSONObjectM2093a.put("adSessionId", str7);
                                str = str6;
                            } catch (JSONException e) {
                                str = str6;
                                Log.e(str, "Error with setting ad session id", e);
                            }
                            try {
                                jSONObjectM2093a.put("notVisibleReason", str8);
                            } catch (JSONException e2) {
                                Log.e(str, "Error with setting not visible reason", e2);
                            }
                            eh2.m821a(jSONObjectM2618a, jSONObjectM2093a);
                        } else {
                            hashSet6 = hashSet6;
                            map5 = map5;
                            str = str6;
                        }
                        eh2.m822b(jSONObjectM2618a);
                        HashMap map8 = map3;
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str7);
                        str6 = str;
                        ((C0132ga) c0200km3.f6401b).m1039a(new na5(c0200km3, hashSet10, jSONObjectM2618a, jNanoTime, (byte) 0));
                        map3 = map8;
                        map2 = map2;
                        hashSet3 = hashSet9;
                        hashSet6 = hashSet6;
                        map6 = map7;
                        map5 = map5;
                        break;
                    }
                }
                HashMap map9 = map6;
                HashSet hashSet11 = hashSet6;
                HashMap map10 = map2;
                HashMap map11 = map3;
                HashSet hashSet12 = hashSet3;
                HashMap map12 = map5;
                if (hashSet5.size() > 0) {
                    View view5 = null;
                    JSONObject jSONObjectM2618a2 = c0391wo.m2618a((View) null);
                    ArrayList arrayList7 = new ArrayList();
                    C0062ca c0062ca2 = C0062ca.f1872c;
                    if (c0062ca2 != null) {
                        Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(c0062ca2.f1874b);
                        IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
                        Iterator it3 = collectionUnmodifiableCollection.iterator();
                        while (it3.hasNext()) {
                            View view6 = (View) ((C0045ba) it3.next()).f1081c.get();
                            if (view6 != null && view6.isAttachedToWindow() && view6.isShown()) {
                                View view7 = view6;
                                while (true) {
                                    if (view7 == null) {
                                        View rootView = view6.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z2 = rootView.getZ();
                                            int size2 = arrayList7.size();
                                            while (size2 > 0 && ((View) arrayList7.get(size2 - 1)).getZ() > z2) {
                                                size2--;
                                            }
                                            arrayList7.add(size2, rootView);
                                            view5 = null;
                                        }
                                    }
                                    if (view7.getAlpha() == 0.0f) {
                                    }
                                    Object parent2 = view7.getParent();
                                    view7 = parent2 instanceof View ? (View) parent2 : view5;
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    int size3 = arrayList7.size();
                    int i2 = 0;
                    while (i2 < size3) {
                        Object obj3 = arrayList7.get(i2);
                        i2++;
                        mz3Var2.m1738a((View) obj3, (C0310ra) c0391wo.f13023a, jSONObjectM2618a2, false);
                    }
                    eh2.m822b(jSONObjectM2618a2);
                    hashSet = hashSet5;
                    ((C0132ga) c0200km3.f6401b).m1039a(new na5(c0200km3, hashSet, jSONObjectM2618a2, jNanoTime, (byte) 1));
                } else {
                    hashSet = hashSet5;
                    ((C0132ga) c0200km3.f6401b).m1039a(new s85(c0200km3));
                }
                map11.clear();
                map9.clear();
                map12.clear();
                hashSet12.clear();
                hashSet.clear();
                hashSet11.clear();
                map10.clear();
                c0311rd2.f10660j = false;
                hashSet8.clear();
                System.nanoTime();
                if (arrayList2.size() > 0) {
                    Iterator it4 = arrayList2.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        xy4.m12778e();
                        return;
                    }
                }
                dg3 dg3Var = dg3.f2483d;
                Context context2 = (Context) dg3Var.f2484a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
                dg3Var.m690a(dg3Var.f2485b, zIsDeviceLocked);
                dg3Var.f2486c = zIsDeviceLocked;
                return;
            case 3:
                Handler handler = mz3.f7440i;
                if (handler != null) {
                    handler.post(mz3.f7441j);
                    mz3.f7440i.postDelayed(mz3.f7442k, 200L);
                    return;
                }
                return;
            case 4:
                ry5.m10503a("CronetLibraryLoader#initializeOnInitThread");
                try {
                    iw5.m6959b(x06.f33904a, r16.f28959t);
                    hr0.f20803h.open();
                    NetworkChangeNotifier.init();
                    NetworkChangeNotifier.setAutoDetectConnectivityState(new RegistrationPolicyAlwaysRegister());
                    ev0.m5329A0();
                    int iM5417a = ew5.m5417a();
                    ry5.m10503a("CronetLibraryLoader#initializeOnInitThread waiting on library load");
                    try {
                        hr0.f20802g.block();
                        Trace.endSection();
                        ry5.m10503a("CronetLibraryLoader#ensureInitialized calling cronetInitOnInitThread");
                        try {
                            AbstractC0768N.MROCxiBo(iM5417a);
                            Trace.endSection();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            try {
                                Trace.endSection();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            Trace.endSection();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        Trace.endSection();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case 5:
                new n56(1, "No consentInformation.").m8537a();
                return;
            case 6:
                new n56(3, "No valid response received yet.").m8537a();
                return;
            case 7:
                new n56(3, "Privacy options form is not required.").m8537a();
                return;
            case 8:
                new n56(3, "Privacy options form is being loading. Please try again later.").m8537a();
                return;
            case 9:
                le6.f23981i.incrementAndGet();
                return;
            default:
                le6.f23981i.incrementAndGet();
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m9364a() {
    }
}
