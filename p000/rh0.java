package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rh0 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public cw2 f29279a;

    /* JADX INFO: renamed from: b */
    public cw2 f29280b;

    /* JADX INFO: renamed from: c */
    public kv2 f29281c;

    /* JADX INFO: renamed from: d */
    public int f29282d;

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listSingletonList;
        int i = this.f29282d;
        b24 b24VarM4325z = d24.m4325z(new qh0(this, null));
        if (b24VarM4325z.hasNext()) {
            Object next = b24VarM4325z.next();
            if (b24VarM4325z.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (b24VarM4325z.hasNext()) {
                    arrayList.add(b24VarM4325z.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = v71.f32439a;
        }
        return id4.m6768O("\n            |Failed to execute op number " + i + ":\n            |" + hb0.m6305Q0(hb0.m6317c1(listSingletonList, 50), "\n", null, null, 0, null, 62) + "\n            ");
    }
}
