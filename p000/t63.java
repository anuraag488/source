package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t63 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30800a;

    public /* synthetic */ t63(byte b) {
        this.f30800a = b;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0423  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        String str;
        pa4 pa4Var = null;
        cm4Var = null;
        cm4 cm4Var = null;
        ml4Var = null;
        ml4 ml4Var = null;
        bm4Var = null;
        bm4 bm4Var = null;
        pa4Var = null;
        int i = 0;
        byte b = 1;
        switch (this.f30800a) {
            case 0:
                return Boolean.valueOf(!((s63) obj).mo3599F());
            case 1:
                m22 m22Var = (m22) obj;
                return (m22Var.f24597a + 1) + ": " + ((u93) m22Var.f24598b).getDescription();
            case 2:
                return ju4.f22634a;
            case 3:
                cd3 cd3Var = (cd3) obj;
                if (cd3Var.isAttachedToWindow()) {
                    cd3Var.m3983q();
                }
                return ju4.f22634a;
            case 4:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i++;
                }
                return arrayList;
            case 5:
                qd2 qd2Var = (qd2) obj;
                qd2Var.f28397a = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                qd2Var.m9862a(fValueOf, 300).f27534b = new bs0(0.05f, 0.7f, 0.1f, 1.0f);
                qd2Var.m9862a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                qd2Var.m9862a(fValueOf2, 1800);
                qd2Var.m9862a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                qd2Var.m9862a(fValueOf3, 3300);
                qd2Var.m9862a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                qd2Var.m9862a(fValueOf4, 4800);
                qd2Var.m9862a(fValueOf4, 6000);
                return ju4.f22634a;
            case 6:
                bh3 bh3Var = bh3.f15270c;
                ic2[] ic2VarArr = o14.f26289a;
                p14 p14Var = m14.f24554c;
                ic2 ic2Var = o14.f26289a[1];
                p14Var.getClass();
                ((q14) obj).mo4898a(p14Var, bh3Var);
                return ju4.f22634a;
            case 7:
                wc3 wc3Var = (wc3) obj;
                n83[] n83VarArr = new n83[32];
                for (int i2 = 0; i2 < 32; i2++) {
                    ArrayList arrayList2 = new ArrayList(4);
                    for (int i3 = 0; i3 < 4; i3++) {
                        arrayList2.add(new ws2());
                    }
                    ArrayList arrayList3 = new ArrayList(4);
                    for (int i4 = 0; i4 < 4; i4++) {
                        arrayList3.add("");
                    }
                    ArrayList arrayList4 = new ArrayList(4);
                    for (int i5 = 0; i5 < 4; i5++) {
                        arrayList4.add(new ro1());
                    }
                    ArrayList arrayList5 = new ArrayList(4);
                    for (int i6 = 0; i6 < 4; i6++) {
                        arrayList5.add(new C1376yp());
                    }
                    n83 n83Var = new n83(b);
                    n83Var.f25534d = arrayList2;
                    n83Var.f25532b = -1;
                    n83Var.f25535e = arrayList4;
                    n83Var.f25533c = -1;
                    n83VarArr[i2] = n83Var;
                }
                yc3 yc3Var = new yc3();
                yc3Var.f35118a = wc3Var;
                yc3Var.f35119b = n83VarArr;
                yc3Var.f35120c = 0;
                VarHandle.storeStoreFence();
                return yc3Var;
            case 8:
                return new tp3(pb0.f27501h, null);
            case 9:
                return ju4.f22634a;
            case 10:
                return new iu3((Map) obj);
            case 11:
                return obj;
            case 12:
                List list = (List) obj;
                Object obj2 = list.get(0);
                yg3 yg3Var = jv3.f22676i;
                Boolean bool = Boolean.FALSE;
                pa4 pa4Var2 = (z62.m13387o(obj2, bool) || obj2 == null) ? null : (pa4) ((yp1) yg3Var.f35216c).invoke(obj2);
                Object obj3 = list.get(1);
                pa4 pa4Var3 = (z62.m13387o(obj3, bool) || obj3 == null) ? null : (pa4) ((yp1) yg3Var.f35216c).invoke(obj3);
                Object obj4 = list.get(2);
                pa4 pa4Var4 = (z62.m13387o(obj4, bool) || obj4 == null) ? null : (pa4) ((yp1) yg3Var.f35216c).invoke(obj4);
                Object obj5 = list.get(3);
                if (!z62.m13387o(obj5, bool) && obj5 != null) {
                    pa4Var = (pa4) ((yp1) yg3Var.f35216c).invoke(obj5);
                }
                ml4 ml4Var2 = new ml4();
                ml4Var2.f25003a = pa4Var2;
                ml4Var2.f25004b = pa4Var3;
                ml4Var2.f25005c = pa4Var4;
                ml4Var2.f25006d = pa4Var;
                VarHandle.storeStoreFence();
                return ml4Var2;
            case 13:
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (z62.m13387o(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((yp1) jv3.f22669b.f35216c).invoke(obj6);
                Object obj7 = list2.get(0);
                return new C0875lk(list3, obj7 != null ? (String) obj7 : null);
            case 14:
                return new uj4(((Integer) obj).intValue());
            case 15:
                List list4 = (List) obj;
                return new zk4(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 16:
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                cm4[] cm4VarArr = bm4.f15418b;
                iv3 iv3Var = jv3.f22691x;
                Boolean bool2 = Boolean.FALSE;
                long j = (((z62.m13387o(obj8, bool2) && iv3Var == null) || obj8 == null) ? null : (bm4) iv3Var.f21823b.invoke(obj8)).f15420a;
                Object obj9 = list5.get(1);
                if ((!z62.m13387o(obj9, bool2) || iv3Var != null) && obj9 != null) {
                    bm4Var = (bm4) iv3Var.f21823b.invoke(obj9);
                }
                return new al4(j, bm4Var.f15420a);
            case 17:
                return new xm1(((Integer) obj).intValue());
            case 18:
                float fFloatValue = ((Float) obj).floatValue();
                C0471ay c0471ay = new C0471ay();
                c0471ay.f14938a = fFloatValue;
                VarHandle.storeStoreFence();
                return c0471ay;
            case 19:
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                int iIntValue = (obj10 != null ? (Integer) obj10 : null).intValue();
                Object obj11 = list6.get(1);
                return ql4.m9897a(sc6.m10657b(iIntValue, (obj11 != null ? (Integer) obj11 : null).intValue()));
            case 20:
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i7 = pb0.f27502i;
                iv3 iv3Var2 = jv3.f22685r;
                Boolean bool3 = Boolean.FALSE;
                long j2 = (((z62.m13387o(obj12, bool3) && iv3Var2 == null) || obj12 == null) ? null : (pb0) iv3Var2.f21823b.invoke(obj12)).f27503a;
                Object obj13 = list7.get(1);
                iv3 iv3Var3 = jv3.f22693z;
                long j3 = (((z62.m13387o(obj13, bool3) && iv3Var3 == null) || obj13 == null) ? null : (b33) iv3Var3.f21823b.invoke(obj13)).f15059a;
                Object obj14 = list7.get(2);
                return new m44(j2, j3, (obj14 != null ? (Float) obj14 : null).floatValue());
            case 21:
                int iIntValue2 = ((Integer) obj).intValue();
                wi4 wi4Var = new wi4();
                wi4Var.f33412a = iIntValue2;
                VarHandle.storeStoreFence();
                return wi4Var;
            case 22:
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                Object obj16 = list8.get(1);
                yg3 yg3Var2 = jv3.f22677j;
                if (!z62.m13387o(obj16, Boolean.FALSE) && obj16 != null) {
                    ml4Var = (ml4) ((yp1) yg3Var2.f35216c).invoke(obj16);
                }
                il2 il2Var = new il2();
                il2Var.f21529a = str2;
                il2Var.f21530b = ml4Var;
                VarHandle.storeStoreFence();
                return il2Var;
            case 23:
                int iIntValue3 = ((Integer) obj).intValue();
                xj4 xj4Var = new xj4();
                xj4Var.f34323a = iIntValue3;
                VarHandle.storeStoreFence();
                return xj4Var;
            case 24:
                int iIntValue4 = ((Integer) obj).intValue();
                fz1 fz1Var = new fz1();
                fz1Var.f19429a = iIntValue4;
                VarHandle.storeStoreFence();
                return fz1Var;
            case 25:
                List list9 = (List) obj;
                ArrayList arrayList6 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj17 = list9.get(i);
                    arrayList6.add((z62.m13387o(obj17, Boolean.FALSE) || obj17 == null) ? null : (C0838kk) ((yp1) jv3.f22670c.f35216c).invoke(obj17));
                    i++;
                }
                return arrayList6;
            case 26:
                return tm1.m11064a(((Integer) obj).intValue());
            case 27:
                return um1.m11584a(((Integer) obj).intValue());
            case 28:
                Boolean bool4 = Boolean.FALSE;
                if (z62.m13387o(obj, bool4)) {
                    return bm4.m3631a(bm4.f15419c);
                }
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                float fFloatValue2 = (obj18 != null ? (Float) obj18 : null).floatValue();
                Object obj19 = list10.get(1);
                iv3 iv3Var4 = jv3.f22692y;
                if ((!z62.m13387o(obj19, bool4) || iv3Var4 != null) && obj19 != null) {
                    cm4Var = (cm4) iv3Var4.f21823b.invoke(obj19);
                }
                return bm4.m3631a(vd6.m11825I(cm4Var.f16128a, fFloatValue2));
            default:
                if (z62.m13387o(obj, 0)) {
                    return cm4.m4047a(8589934592L);
                }
                return z62.m13387o(obj, 1) ? cm4.m4047a(4294967296L) : cm4.m4047a(0L);
        }
    }
}
