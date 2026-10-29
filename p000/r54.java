package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r54 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29028a;

    public /* synthetic */ r54(byte b) {
        this.f29028a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        Object next;
        byte b = this.f29028a;
        int i = 0;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return ju4Var;
            case 2:
                Rect rect = new Rect();
                ArrayList arrayList = new ArrayList();
                se0.m10732m((AccessibilityNodeInfo) obj, arrayList);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((AccessibilityNodeInfo) obj2).isVisibleToUser()) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        ((AccessibilityNodeInfo) next).getBoundsInScreen(rect);
                        int i2 = rect.top;
                        do {
                            Object next2 = it.next();
                            ((AccessibilityNodeInfo) next2).getBoundsInScreen(rect);
                            int i3 = rect.top;
                            if (i2 > i3) {
                                next = next2;
                                i2 = i3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) next;
                if (accessibilityNodeInfo != null) {
                    return se0.m10740u(accessibilityNodeInfo);
                }
                return null;
            case 3:
                return ju4Var;
            case 4:
                return ju4Var;
            case 5:
                return ju4Var;
            case 6:
                ic2[] ic2VarArr = o14.f26289a;
                p14 p14Var = m14.f24564m;
                ic2 ic2Var = o14.f26289a[5];
                Boolean bool = Boolean.TRUE;
                p14Var.getClass();
                ((q14) obj).mo4898a(p14Var, bool);
                return ju4Var;
            case 7:
                return ju4Var;
            case 8:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 9:
                gf4 gf4VarM11888b = ((ve4) obj).m11888b("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (gf4VarM11888b.mo5112g()) {
                        arrayList3.add(gf4VarM11888b.mo5110b(0));
                    }
                    gf4VarM11888b.close();
                    return arrayList3;
                } catch (Throwable th) {
                    gf4VarM11888b.close();
                    throw th;
                }
            case 10:
                ((wp1) obj).invoke();
                return ju4Var;
            case 11:
                return (kx1) obj;
            case 12:
                return o52.m8954a(0L);
            case 13:
                ((Long) obj).getClass();
                return ju4Var;
            case 14:
                ((Float) obj).getClass();
                return ju4Var;
            case 15:
                ((Integer) obj).intValue();
                return zj4.f36153a;
            case 16:
                dk4 dk4Var = (dk4) obj;
                String str = dk4Var.f17127g.f24092b;
                long j = dk4Var.f17126f;
                int i4 = ql4.f28557c;
                int i5 = (int) (j & 4294967295L);
                int iOffsetByCodePoints = (i5 > 0 && i5 > 0) ? Character.offsetByCodePoints(str, i5, -1) : -1;
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new ey0(((int) (dk4Var.f17126f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 17:
                dk4 dk4Var2 = (dk4) obj;
                String str2 = dk4Var2.f17127g.f24092b;
                long j2 = dk4Var2.f17126f;
                int i6 = ql4.f28557c;
                int i7 = (int) (j2 & 4294967295L);
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str2);
                int iFollowing = characterInstance.following(i7);
                if (iFollowing != -1) {
                    return new ey0(0, iFollowing - ((int) (dk4Var2.f17126f & 4294967295L)));
                }
                return null;
            case 18:
                dk4 dk4Var3 = (dk4) obj;
                Integer numM4529e = dk4Var3.m4529e();
                if (numM4529e == null) {
                    return null;
                }
                int iIntValue = numM4529e.intValue();
                long j3 = dk4Var3.f17126f;
                int i8 = ql4.f28557c;
                return new ey0(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 19:
                dk4 dk4Var4 = (dk4) obj;
                Integer numM4528d = dk4Var4.m4528d();
                if (numM4528d == null) {
                    return null;
                }
                int iIntValue2 = numM4528d.intValue();
                long j4 = dk4Var4.f17126f;
                int i9 = ql4.f28557c;
                return new ey0(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 20:
                dk4 dk4Var5 = (dk4) obj;
                Integer numM4527c = dk4Var5.m4527c();
                if (numM4527c == null) {
                    return null;
                }
                int iIntValue3 = numM4527c.intValue();
                long j5 = dk4Var5.f17126f;
                int i10 = ql4.f28557c;
                return new ey0(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 21:
                dk4 dk4Var6 = (dk4) obj;
                Integer numM4526b = dk4Var6.m4526b();
                if (numM4526b == null) {
                    return null;
                }
                int iIntValue4 = numM4526b.intValue();
                long j6 = dk4Var6.f17126f;
                int i11 = ql4.f28557c;
                return new ey0(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 22:
                List list = (List) obj;
                return new hk4(((Boolean) list.get(1)).booleanValue() ? d63.f16814a : d63.f16815b, ((Float) list.get(0)).floatValue());
            case 23:
                return ju4Var;
            case 24:
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                yg3 yg3Var = jv3.f22668a;
                Boolean bool2 = Boolean.FALSE;
                C0875lk c0875lk = (z62.m13387o(obj3, bool2) || obj3 == null) ? null : (C0875lk) ((yp1) yg3Var.f35216c).invoke(obj3);
                Object obj4 = list2.get(1);
                int i12 = ql4.f28557c;
                return new xk4(c0875lk, ((z62.m13387o(obj4, bool2) || obj4 == null) ? null : (ql4) ((yp1) jv3.f22683p.f35216c).invoke(obj4)).f28558a, (ql4) null);
            case 25:
                return ju4Var;
            case 26:
                return ju4Var;
            case 27:
                return ju4Var;
            case 28:
                return ju4Var;
            default:
                List list3 = (List) obj;
                return new ho4(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue(), ((Number) list3.get(2)).floatValue());
        }
    }
}
