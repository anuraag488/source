package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg0 implements pq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35210a;

    public /* synthetic */ yg0(byte b) {
        this.f35210a = b;
    }

    @Override // p000.pq1
    /* JADX INFO: renamed from: d */
    public final Object mo6994d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.f35210a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                pj4 pj4Var = (pj4) obj;
                ej4 ej4Var = (ej4) obj2;
                wp1 wp1Var = (wp1) obj3;
                mi0 mi0Var = (mi0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((ir1) mi0Var).m6890g(pj4Var) : ((ir1) mi0Var).m6894i(pj4Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? ((ir1) mi0Var).m6890g(ej4Var) : ((ir1) mi0Var).m6894i(ej4Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= ((ir1) mi0Var).m6894i(wp1Var) ? 256 : 128;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(i & 1, (i & 1171) != 1170)) {
                    ir1Var.m6874W();
                } else {
                    dx0.m4787c(pj4Var, ej4Var, wp1Var, ir1Var, i & 1022);
                }
                break;
            case 1:
                pj4 pj4Var2 = (pj4) obj;
                ej4 ej4Var2 = (ej4) obj2;
                wp1 wp1Var2 = (wp1) obj3;
                mi0 mi0Var2 = (mi0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((ir1) mi0Var2).m6890g(pj4Var2) : ((ir1) mi0Var2).m6894i(pj4Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? ((ir1) mi0Var2).m6890g(ej4Var2) : ((ir1) mi0Var2).m6894i(ej4Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= ((ir1) mi0Var2).m6894i(wp1Var2) ? 256 : 128;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
                    ir1Var2.m6874W();
                } else {
                    dx0.m4787c(pj4Var2, ej4Var2, wp1Var2, ir1Var2, i2 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                ql4 ql4Var = (ql4) obj5;
                String string = ((CharSequence) obj4).subSequence(ql4.m9903g(ql4Var.f28558a), ql4.m9902f(ql4Var.f28558a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return ju4Var;
    }
}
