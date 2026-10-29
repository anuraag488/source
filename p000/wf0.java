package p000;

import android.os.Bundle;
import essentials.app.EsActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33285a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ag0 f33286b;

    public /* synthetic */ wf0(byte b) {
        this.f33285a = b;
    }

    /* JADX INFO: renamed from: a */
    public final void m12243a() {
        byte b = this.f33285a;
        ag0 ag0Var = this.f33286b;
        switch (b) {
            case 0:
                Bundle bundleM13253a = ((yu3) ag0Var.f14450d.f27897c).m13253a("android:support:activity-result");
                if (bundleM13253a != null) {
                    zf0 zf0Var = ag0Var.f14455i;
                    LinkedHashMap linkedHashMap = zf0Var.f36040b;
                    LinkedHashMap linkedHashMap2 = zf0Var.f36039a;
                    Bundle bundle = zf0Var.f36045g;
                    ArrayList<Integer> integerArrayList = bundleM13253a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM13253a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleM13253a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            zf0Var.f36042d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleM13253a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    as4.m3256o(linkedHashMap2).remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                            zf0Var.f36040b.put(str2, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                rn1 rn1Var = (rn1) ((EsActivity) ag0Var).f30402v.f22555a;
                rn1Var.f29433x.m5240b(rn1Var, rn1Var, null);
                break;
        }
    }
}
