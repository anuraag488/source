package p000;

import android.content.Context;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1317x3 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33949a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Context f33950b;

    public /* synthetic */ C1317x3(byte b) {
        this.f33949a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        boolean zCanDrawOverlays;
        byte b = this.f33949a;
        Context context = this.f33950b;
        switch (b) {
            case 0:
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
                boolean z = false;
                if (string != null) {
                    List listM6353s0 = hd4.m6353s0(string, new String[]{":"}, 6);
                    ArrayList arrayList = new ArrayList(ib0.m6717y0(listM6353s0, 10));
                    Iterator it = listM6353s0.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) hb0.m6299K0(hd4.m6353s0((String) it.next(), new String[]{"/"}, 6)));
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (z62.m13387o((String) obj, context.getPackageName())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                zCanDrawOverlays = Settings.canDrawOverlays(context);
                break;
            default:
                zCanDrawOverlays = Settings.System.canWrite(context);
                break;
        }
        return Boolean.valueOf(zCanDrawOverlays);
    }
}
