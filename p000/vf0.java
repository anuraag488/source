package p000;

import android.os.Bundle;
import essentials.app.EsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf0 implements xu3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32562a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32563b;

    public /* synthetic */ vf0(byte b) {
        this.f32562a = b;
    }

    @Override // p000.xu3
    /* JADX INFO: renamed from: a */
    public final Bundle mo6427a() {
        eo1 eo1Var;
        l73[] l73VarArr;
        byte b = this.f32562a;
        Object obj = this.f32563b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                zf0 zf0Var = ((ag0) obj).f14455i;
                zf0Var.getClass();
                LinkedHashMap linkedHashMap = zf0Var.f36040b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(zf0Var.f36042d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(zf0Var.f36045g));
                return bundle;
            case 1:
                Map mapMo8111c = ((mu3) obj).mo8111c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapMo8111c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                EsActivity esActivity = (EsActivity) obj;
                do {
                    eo1Var = ((rn1) esActivity.f30402v.f22555a).f29433x;
                    fk2 fk2Var = fk2.f19054a;
                } while (sn1.m10875j(eo1Var));
                esActivity.f30403w.m9154f(ek2.ON_STOP);
                return new Bundle();
            case 3:
                return ((eo1) obj).m5233V();
            default:
                C1122rv c1122rv = (C1122rv) obj;
                for (Map.Entry entry2 : eq2.m5278Q((LinkedHashMap) c1122rv.f29654e).entrySet()) {
                    c1122rv.m10465x(((ac4) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : eq2.m5278Q((LinkedHashMap) c1122rv.f29652c).entrySet()) {
                    c1122rv.m10465x(((xu3) entry3.getValue()).mo6427a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1122rv.f29651b;
                if (linkedHashMap2.isEmpty()) {
                    l73VarArr = new l73[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new l73((String) entry4.getKey(), entry4.getValue()));
                    }
                    l73VarArr = (l73[]) arrayList.toArray(new l73[0]);
                }
                return kx5.m7742x((l73[]) Arrays.copyOf(l73VarArr, l73VarArr.length));
        }
    }
}
