package p000;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f36039a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f36040b;

    /* JADX INFO: renamed from: c */
    public LinkedHashMap f36041c;

    /* JADX INFO: renamed from: d */
    public ArrayList f36042d;

    /* JADX INFO: renamed from: e */
    public transient LinkedHashMap f36043e;

    /* JADX INFO: renamed from: f */
    public LinkedHashMap f36044f;

    /* JADX INFO: renamed from: g */
    public Bundle f36045g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ ag0 f36046h;

    /* JADX INFO: renamed from: a */
    public final boolean m13543a(int i, int i2, Intent intent) {
        String str = (String) this.f36039a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0563d5 c0563d5 = (C0563d5) this.f36043e.get(str);
        ArrayList arrayList = this.f36042d;
        if ((c0563d5 != null ? c0563d5.f16782a : null) == null || !arrayList.contains(str)) {
            this.f36044f.remove(str);
            this.f36045g.putParcelable(str, new C1318x4(intent, i2));
            return true;
        }
        c0563d5.f16782a.mo7271b(c0563d5.f16783b.m89E(intent, i2));
        arrayList.remove(str);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m13544b(int i, C0006a5 c0006a5, Object obj, ar3 ar3Var) {
        C1392z4 c1392z4;
        byte b;
        Intent intentPutExtra;
        Bundle bundleExtra;
        ag0 ag0Var = this.f36046h;
        Bundle bundle = null;
        switch (c0006a5.f107a) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length != 0) {
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            int iM5779K = fq2.m5779K(strArr.length);
                            if (iM5779K < 16) {
                                iM5779K = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K);
                            for (String str : strArr) {
                                linkedHashMap.put(str, Boolean.TRUE);
                            }
                            c1392z4 = new C1392z4(linkedHashMap);
                        } else {
                            String str2 = strArr[i2];
                            if (str2 == null) {
                                xy4.m12782k("permission must be non-null");
                            } else if (ag0Var.checkPermission(str2, Process.myPid(), Process.myUid()) == 0) {
                                i2++;
                            }
                        }
                        break;
                    }
                } else {
                    c1392z4 = new C1392z4(w71.f33134a);
                    break;
                }
            default:
                c1392z4 = null;
                break;
        }
        if (c1392z4 != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            RunnableC1248v9 runnableC1248v9 = new RunnableC1248v9((byte) 1);
            runnableC1248v9.f32471c = this;
            runnableC1248v9.f32470b = i;
            runnableC1248v9.f32472d = c1392z4;
            VarHandle.storeStoreFence();
            handler.post(runnableC1248v9);
            return;
        }
        switch (c0006a5.f107a) {
            case 0:
                b = 2;
                intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                break;
            case 1:
                b = 2;
                intentPutExtra = (Intent) obj;
                break;
            case 2:
                b = 2;
                intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (b62) obj);
                break;
            default:
                b62 b62Var = (b62) obj;
                intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent = b62Var.f15106b;
                if (intent == null || (bundleExtra = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null) {
                    b = 2;
                } else {
                    intentPutExtra.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        b = 2;
                        b62Var = new b62(b62Var.f15105a, null, b62Var.f15107c, b62Var.f15108d);
                    } else {
                        b = 2;
                    }
                }
                intentPutExtra.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", b62Var);
                if (eo1.m5212J(b)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intentPutExtra);
                }
                break;
        }
        if (intentPutExtra.getExtras() != null && intentPutExtra.getExtras().getClassLoader() == null) {
            intentPutExtra.setExtrasClassLoader(ag0Var.getClassLoader());
        }
        if (intentPutExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentPutExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentPutExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else if (ar3Var != null) {
            bundle = ((ActivityOptions) ar3Var.f14813b).toBundle();
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentPutExtra.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentPutExtra.getAction())) {
                ag0Var.startActivityForResult(intentPutExtra, i, bundle);
                return;
            }
            b62 b62Var2 = (b62) intentPutExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                ag0Var.startIntentSenderForResult(b62Var2.f15105a, i, b62Var2.f15106b, b62Var2.f15107c, b62Var2.f15108d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                Handler handler2 = new Handler(Looper.getMainLooper());
                RunnableC1248v9 runnableC1248v10 = new RunnableC1248v9(b);
                runnableC1248v10.f32471c = this;
                runnableC1248v10.f32470b = i;
                runnableC1248v10.f32472d = e;
                VarHandle.storeStoreFence();
                handler2.post(runnableC1248v10);
                return;
            }
        }
        String[] stringArrayExtra = intentPutExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (String str3 : stringArrayExtra) {
            if (TextUtils.isEmpty(str3)) {
                C1077qn.m9987m(zi4.m13623w(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = stringArrayExtra[i4];
                    i3++;
                }
            }
        }
        ag0Var.requestPermissions(stringArrayExtra, i);
    }

    /* JADX INFO: renamed from: c */
    public final C0638f5 m13545c(String str, C0006a5 c0006a5, InterfaceC1355y4 interfaceC1355y4) {
        Bundle bundle = this.f36045g;
        m13546d(str);
        this.f36043e.put(str, new C0563d5(interfaceC1355y4, c0006a5));
        LinkedHashMap linkedHashMap = this.f36044f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC1355y4.mo7271b(obj);
        }
        C1318x4 c1318x4 = (C1318x4) zt5.m13791x(str, bundle);
        if (c1318x4 != null) {
            bundle.remove(str);
            interfaceC1355y4.mo7271b(c0006a5.m89E(c1318x4.f33969b, c1318x4.f33968a));
        }
        C0638f5 c0638f5 = new C0638f5((byte) 1);
        c0638f5.f18765b = this;
        c0638f5.f18766c = str;
        c0638f5.f18767d = c0006a5;
        VarHandle.storeStoreFence();
        return c0638f5;
    }

    /* JADX INFO: renamed from: d */
    public final void m13546d(String str) {
        LinkedHashMap linkedHashMap = this.f36039a;
        LinkedHashMap linkedHashMap2 = this.f36040b;
        if (((Integer) linkedHashMap2.get(str)) != null) {
            return;
        }
        C0515c5 c0515c5 = new C0515c5((byte) 0);
        C0729hl c0729hl = new C0729hl((byte) 2);
        c0729hl.f20669b = c0515c5;
        VarHandle.storeStoreFence();
        xr1 xr1Var = new xr1(c0515c5, c0729hl);
        fl0<Number> fl0Var = new fl0();
        fl0Var.f19066a = new AtomicReference(xr1Var);
        VarHandle.storeStoreFence();
        for (Number number : fl0Var) {
            if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
                int iIntValue = number.intValue();
                linkedHashMap.put(Integer.valueOf(iIntValue), str);
                linkedHashMap2.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        ds3.m4667k("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: e */
    public final void m13547e(String str) {
        Integer num;
        LinkedHashMap linkedHashMap = this.f36041c;
        Bundle bundle = this.f36045g;
        LinkedHashMap linkedHashMap2 = this.f36044f;
        if (!this.f36042d.contains(str) && (num = (Integer) this.f36040b.remove(str)) != null) {
            this.f36039a.remove(num);
        }
        this.f36043e.remove(str);
        if (linkedHashMap2.containsKey(str)) {
            StringBuilder sbM10844j = sk5.m10844j("Dropping pending result for request ", str, ": ");
            sbM10844j.append(linkedHashMap2.get(str));
            Log.w("ActivityResultRegistry", sbM10844j.toString());
            linkedHashMap2.remove(str);
        }
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C1318x4) zt5.m13791x(str, bundle)));
            bundle.remove(str);
        }
        C0599e5 c0599e5 = (C0599e5) linkedHashMap.get(str);
        if (c0599e5 != null) {
            ArrayList arrayList = c0599e5.f17691b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c0599e5.f17690a.mo6017c((jk2) obj);
            }
            arrayList.clear();
            linkedHashMap.remove(str);
        }
    }
}
