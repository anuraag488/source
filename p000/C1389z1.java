package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1389z1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35689a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Collection f35690b;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        boolean zContains;
        byte b = this.f35689a;
        Collection<?> collection = this.f35690b;
        switch (b) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
