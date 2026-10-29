package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.VarHandle;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: vo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1263vo implements oe1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32756a;

    /* JADX INFO: renamed from: b */
    public Uri f32757b;

    /* JADX INFO: renamed from: c */
    public b63 f32758c;

    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final Object mo3767a(wm0 wm0Var) throws XmlPullParserException, IOException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer numM9044Y;
        Drawable drawable;
        switch (this.f32756a) {
            case 0:
                String strM6305Q0 = hb0.m6305Q0(hb0.m6295G0(this.f32757b.getPathSegments(), 1), "/", null, null, 0, null, 62);
                return new oa4(new ka4(new ak3(n40.m8490A(this.f32758c.f15109a.getAssets().open(strM6305Q0))), new C1189to((byte) 16)), AbstractC0707h.m6199b(MimeTypeMap.getSingleton(), strM6305Q0), kt0.f23415c);
            case 1:
                b63 b63Var = this.f32758c;
                ContentResolver contentResolver = b63Var.f15109a.getContentResolver();
                Uri uri = this.f32757b;
                if (z62.m13387o(uri.getAuthority(), "com.android.contacts") && z62.m13387o(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        nm0.m8796h("Unable to find a contact photo associated with '", uri, "'.");
                        return null;
                    }
                } else if (z62.m13387o(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && z62.m13387o(pathSegments.get(size - 3), "audio") && z62.m13387o(pathSegments.get(size - 2), "albums")) {
                    g74 g74Var = b63Var.f15112d;
                    qs5 qs5Var = g74Var.f19640a;
                    oz0 oz0Var = qs5Var instanceof oz0 ? (oz0) qs5Var : null;
                    if (oz0Var != null) {
                        int i = oz0Var.f27241l;
                        qs5 qs5Var2 = g74Var.f19641b;
                        oz0 oz0Var2 = qs5Var2 instanceof oz0 ? (oz0) qs5Var2 : null;
                        if (oz0Var2 != null) {
                            int i2 = oz0Var2.f27241l;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        nm0.m8796h("Unable to find a music thumbnail associated with '", uri, "'.");
                        return null;
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        nm0.m8796h("Unable to open '", uri, "'.");
                        return null;
                    }
                }
                return new oa4(new ka4(new ak3(n40.m8490A(inputStreamOpenInputStream)), new C1189to((byte) 16)), contentResolver.getType(uri), kt0.f23415c);
            default:
                b63 b63Var2 = this.f32758c;
                Uri uri2 = this.f32757b;
                String authority = uri2.getAuthority();
                if (authority != null) {
                    if (hd4.m6345k0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) hb0.m6307S0(uri2.getPathSegments());
                        if (str == null || (numM9044Y = od4.m9044Y(str)) == null) {
                            wb1.m12196p(uri2, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numM9044Y.intValue();
                        Context context = b63Var2.f15109a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM6199b = AbstractC0707h.m6199b(MimeTypeMap.getSingleton(), charSequence.subSequence(hd4.m6346l0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!z62.m13387o(strM6199b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            ak3 ak3Var = new ak3(n40.m8490A(resources.openRawResource(iIntValue, typedValue2)));
                            int i3 = typedValue2.density;
                            uo3 uo3Var = new uo3((byte) 16);
                            uo3Var.f32032j = i3;
                            VarHandle.storeStoreFence();
                            return new oa4(new ka4(ak3Var, uo3Var), strM6199b, kt0.f23415c);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = C0006a5.m83u(context, iIntValue);
                            if (drawable == null) {
                                xy4.m12780h(c75.m3877i(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            int i4 = vo3.f32764a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                xy4.m12780h(c75.m3877i(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        boolean z = drawable instanceof VectorDrawable;
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), sj3.m10823s(drawable, b63Var2.f15110b, b63Var2.f15112d, b63Var2.f15113e, b63Var2.f15114f));
                        }
                        return new d41(drawable, z, kt0.f23415c);
                    }
                }
                wb1.m12196p(uri2, "Invalid android.resource URI: ");
                return null;
        }
    }
}
