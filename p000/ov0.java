package p000;

import java.lang.invoke.VarHandle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ov0 implements vq4 {
    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        if (cs4Var.f16429a != Date.class) {
            return null;
        }
        rv0 rv0Var = new rv0();
        ArrayList arrayList = new ArrayList();
        rv0Var.f29658b = arrayList;
        rv0Var.f29657a = qv0.f28820a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p82.f27430a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
        VarHandle.storeStoreFence();
        return rv0Var;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
