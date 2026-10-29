package p000;

import ads_mobile_sdk.a83;
import ads_mobile_sdk.oh3;
import ads_mobile_sdk.su1;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.view.inputmethod.ExtractedText;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class oh6 {

    /* JADX INFO: renamed from: S */
    public static g12 f26725S;

    /* JADX INFO: renamed from: T */
    public static g12 f26726T;

    /* JADX INFO: renamed from: a */
    public static final pg0 f26727a = new pg0(2086858902, false, new qg0(8));

    /* JADX INFO: renamed from: b */
    public static final pg0 f26728b = new pg0(781018993, false, new fh0(7));

    /* JADX INFO: renamed from: c */
    public static final pg0 f26729c = new pg0(-1064796308, false, new sg0(28));

    /* JADX INFO: renamed from: d */
    public static final pg0 f26730d = new pg0(-380835602, false, new qg0(3));

    /* JADX INFO: renamed from: e */
    public static final pg0 f26731e = new pg0(1943724095, false, new qg0(4));

    /* JADX INFO: renamed from: f */
    public static final pg0 f26732f = new pg0(1162021978, false, new fh0(12));

    /* JADX INFO: renamed from: g */
    public static final pg0 f26733g = new pg0(349485402, false, new qg0(5));

    /* JADX INFO: renamed from: h */
    public static final pg0 f26734h = new pg0(332197852, false, new qg0(6));

    /* JADX INFO: renamed from: i */
    public static final pg0 f26735i = new pg0(-292471265, false, new fh0(13));

    /* JADX INFO: renamed from: j */
    public static final pg0 f26736j = new pg0(1155010965, false, new qg0(7));

    /* JADX INFO: renamed from: k */
    public static final pg0 f26737k = new pg0(1233132054, false, new qg0(9));

    /* JADX INFO: renamed from: l */
    public static final pg0 f26738l = new pg0(1311253143, false, new qg0(10));

    /* JADX INFO: renamed from: m */
    public static final pg0 f26739m = new pg0(1934641662, false, new qg0(11));

    /* JADX INFO: renamed from: n */
    public static final pg0 f26740n = new pg0(-300403137, false, new qg0(12));

    /* JADX INFO: renamed from: o */
    public static final pg0 f26741o = new pg0(1759519360, false, new sg0(17));

    /* JADX INFO: renamed from: p */
    public static final pg0 f26742p = new pg0(-2121505853, false, new fh0(5));

    /* JADX INFO: renamed from: q */
    public static final pg0 f26743q = new pg0(-2124155811, false, new sg0(18));

    /* JADX INFO: renamed from: r */
    public static final pg0 f26744r = new pg0(1995689183, false, new sg0(19));

    /* JADX INFO: renamed from: s */
    public static final pg0 f26745s = new pg0(-1877724258, false, new sg0(20));

    /* JADX INFO: renamed from: t */
    public static final pg0 f26746t = new pg0(1635540921, false, new fh0(6));

    /* JADX INFO: renamed from: u */
    public static final pg0 f26747u = new pg0(1628529908, false, new sg0(21));

    /* JADX INFO: renamed from: v */
    public static final pg0 f26748v = new pg0(1706650997, false, new sg0(22));

    /* JADX INFO: renamed from: w */
    public static final pg0 f26749w = new pg0(1784772086, false, new sg0(23));

    /* JADX INFO: renamed from: x */
    public static final pg0 f26750x = new pg0(212020217, false, new fh0(8));

    /* JADX INFO: renamed from: y */
    public static final pg0 f26751y = new pg0(-1886806691, false, new sg0(24));

    /* JADX INFO: renamed from: z */
    public static final pg0 f26752z = new pg0(173115806, false, new sg0(25));

    /* JADX INFO: renamed from: A */
    public static final pg0 f26707A = new pg0(-2061928993, false, new sg0(26));

    /* JADX INFO: renamed from: B */
    public static final pg0 f26708B = new pg0(-1647986910, false, new fh0(9));

    /* JADX INFO: renamed from: C */
    public static final pg0 f26709C = new pg0(-1404205315, false, new sg0(27));

    /* JADX INFO: renamed from: D */
    public static final pg0 f26710D = new pg0(2109059864, false, new fh0(10));

    /* JADX INFO: renamed from: E */
    public static final pg0 f26711E = new pg0(2102048851, false, new sg0(29));

    /* JADX INFO: renamed from: F */
    public static final pg0 f26712F = new pg0(-2036676267, false, new qg0(0));

    /* JADX INFO: renamed from: G */
    public static final pg0 f26713G = new pg0(685539160, false, new fh0(11));

    /* JADX INFO: renamed from: H */
    public static final pg0 f26714H = new pg0(1296523288, false, new qg0(1));

    /* JADX INFO: renamed from: I */
    public static final pg0 f26715I = new pg0(1279235738, false, new qg0(2));

    /* JADX INFO: renamed from: J */
    public static final pg0 f26716J = new pg0(-432299709, false, new ah0(18));

    /* JADX INFO: renamed from: K */
    public static final pg0 f26717K = new pg0(1178257564, false, new ah0(19));

    /* JADX INFO: renamed from: L */
    public static final fp1 f26718L = new fp1();

    /* JADX INFO: renamed from: M */
    public static final d94 f26719M = new d94();

    /* JADX INFO: renamed from: N */
    public static final z45 f26720N = new z45(19);

    /* JADX INFO: renamed from: O */
    public static final String[] f26721O = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: P */
    public static final String[] f26722P = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: Q */
    public static final String[] f26723Q = {"items"};

    /* JADX INFO: renamed from: R */
    public static final String[] f26724R = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* JADX INFO: renamed from: A */
    public static final pp1 m9076A(String str, xn2 xn2Var, long j, mq1 mq1Var, oq1 oq1Var, ir1 ir1Var, int i) {
        long j2;
        if ((i & 4) != 0) {
            r50 r50Var = i41.f21117b;
            j2 = 0;
        } else {
            j2 = j;
        }
        sw2 sw2VarM7369C = k43.m7369C(i41.m6644c(j2), ir1Var);
        C0861l6 c0861l6 = (C0861l6) ir1Var.m6898k(AbstractC0935n6.f25472a);
        xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
        wp1 wp1Var = (wp1) ir1Var.m6898k(hj0.f20619a);
        Object objM6869O = ir1Var.m6869O();
        wm0 wm0Var = null;
        Object obj = ki0.f23136a;
        Object obj2 = objM6869O;
        if (objM6869O == obj) {
            pp1 pp1Var = new pp1();
            pp1Var.f27884f = wp1Var;
            pp1Var.f27879a = k43.m7398w(Boolean.FALSE);
            pp1Var.f27880b = k43.m7398w(null);
            pp1Var.f27882d = 0L;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(pp1Var);
            obj2 = pp1Var;
        }
        pp1 pp1Var2 = (pp1) obj2;
        ag0 ag0VarM12798a = xz4Var.m12798a();
        boolean zM6890g = ir1Var.m6890g(xz4Var) | ir1Var.m6894i(xn2Var);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6890g || objM6869O2 == obj) {
            objM6869O2 = new C0671g0((Object) xz4Var, (Object) xn2Var, wm0Var, (byte) 25);
            ir1Var.m6905n0(objM6869O2);
        }
        sw2 sw2VarM13358Q = z62.m13358Q(ir1Var, (mq1) objM6869O2, ag0VarM12798a);
        Object objM6869O3 = ir1Var.m6869O();
        if (objM6869O3 == obj) {
            objM6869O3 = lb5.m7942w(r71.f29063a, ir1Var);
            ir1Var.m6905n0(objM6869O3);
        }
        zo0 zo0Var = (zo0) objM6869O3;
        if (((ag0) sw2VarM13358Q.getValue()) == null) {
            ir1Var.m6885d0(8062229);
            ir1Var.m6912r(false);
            return pp1Var2;
        }
        ir1Var.m6885d0(5990313);
        Integer numValueOf = Integer.valueOf(((Configuration) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14650a)).orientation);
        boolean zM6890g2 = ir1Var.m6890g(c0861l6) | ir1Var.m6890g(wp1Var) | ir1Var.m6894i(xn2Var) | ir1Var.m6890g(str) | ir1Var.m6890g(zo0Var) | ir1Var.m6890g(sw2VarM7369C) | ir1Var.m6890g(xz4Var) | ir1Var.m6890g(sw2VarM13358Q);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == obj) {
            Object mp1Var = new mp1(c0861l6, pp1Var2, wp1Var, xn2Var, mq1Var, str, zo0Var, sw2VarM7369C, xz4Var, oq1Var, sw2VarM13358Q, null);
            ir1Var.m6905n0(mp1Var);
            objM6869O4 = mp1Var;
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O4, numValueOf);
        ir1Var.m6912r(false);
        return pp1Var2;
    }

    /* JADX INFO: renamed from: B */
    public static final void m9077B(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m9078C(bl4 bl4Var, uj2 uj2Var, xk4 xk4Var, l12 l12Var, vi3 vi3Var) {
        nh3 nh3Var = uj2Var.f31915d;
        zn0 zn0Var = uj2Var.f31933v;
        zn0 zn0Var2 = uj2Var.f31934w;
        ql3 ql3Var = new ql3();
        bh4 bh4Var = new bh4((byte) 2);
        bh4Var.f15274b = nh3Var;
        bh4Var.f15275c = zn0Var;
        bh4Var.f15276d = ql3Var;
        VarHandle.storeStoreFence();
        yb3 yb3Var = bl4Var.f15404a;
        yb3Var.mo4545a(xk4Var, l12Var, bh4Var, zn0Var2);
        el4 el4Var = new el4(bl4Var, yb3Var);
        bl4Var.f15405b.set(el4Var);
        ql3Var.f28555a = el4Var;
        uj2Var.f31916e = el4Var;
        m9119y(uj2Var, xk4Var, vi3Var);
    }

    /* JADX INFO: renamed from: D */
    public static xo3 m9079D(xo3 xo3Var) {
        if ((xo3Var != null ? xo3Var.f34500g : null) == null) {
            return xo3Var;
        }
        wo3 wo3VarM12724a = xo3Var.m12724a();
        wo3VarM12724a.f33555g = null;
        return wo3VarM12724a.m12344a();
    }

    /* JADX INFO: renamed from: E */
    public static final String m9080E(Object[] objArr, int i, int i2, AbstractC1315x1 abstractC1315x1) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC1315x1) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: F */
    public static final String m9081F(wm1 wm1Var, Context context) {
        gq6.m6078c(context);
        int i = context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == 0) {
            List list = wm1Var.f33488a;
            el1 el1Var = new el1((byte) 1);
            VarHandle.storeStoreFence();
            return yl2.m13170a(list, null, el1Var, 31);
        }
        List list2 = wm1Var.f33488a;
        if (list2.size() > 0) {
            list2.get(0).getClass();
            xy4.m12778e();
            return null;
        }
        return ((Object) (!wm1Var.f33488a.isEmpty() ? "," : "")) + "'wght' " + sc6.m10674o(i + 400.0f, 1.0f, 1000.0f);
    }

    /* JADX INFO: renamed from: G */
    public static final ExtractedText m9082G(xk4 xk4Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = xk4Var.f34341a.f24092b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = xk4Var.f34342b;
        extractedText.selectionStart = ql4.m9903g(j);
        extractedText.selectionEnd = ql4.m9902f(j);
        extractedText.flags = !hd4.m6336b0(xk4Var.f34341a.f24092b, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: H */
    public static final void m9083H(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: I */
    public static void m9084I(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, i);
        parcel.writeBundle(bundle);
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: J */
    public static void m9085J(Parcel parcel, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, 2);
        parcel.writeByteArray(bArr);
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: K */
    public static void m9086K(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: L */
    public static void m9087L(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: M */
    public static void m9088M(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, i);
        parcel.writeString(str);
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: N */
    public static void m9089N(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: O */
    public static void m9090O(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM9092Q = m9092Q(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: P */
    public static void m9091P(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX INFO: renamed from: Q */
    public static int m9092Q(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: R */
    public static ah6 m9093R() {
        String str;
        ClassLoader classLoader = oh6.class.getClassLoader();
        if (ah6.class.equals(ah6.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!ah6.class.getPackage().equals(oh6.class.getPackage())) {
                C1077qn.m9987m(ah6.class.getName());
                return null;
            }
            str = ah6.class.getPackage().getName() + ".BlazeGenerated" + ah6.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        c75.m3884p(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new oh6[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(ng6.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(ah6.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (ah6) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (ah6) ah6.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m9094S(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: a */
    public static final void m9095a(boolean z, wp1 wp1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-361453782);
        byte b = 2;
        int i2 = (ir1Var.m6892h(z) ? 4 : 2) | i | (ir1Var.m6894i(wp1Var) ? 32 : 16);
        byte b2 = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            Object objM11585a = (cz2) ir1Var.m6898k(tm2.f31238a);
            if (objM11585a == null) {
                ir1Var.m6885d0(535274673);
                objM11585a = um2.m11585a(ir1Var);
            } else {
                ir1Var.m6885d0(535271790);
            }
            ir1Var.m6912r(false);
            if (objM11585a == null) {
                C1077qn.m9989o("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM6890g = ir1Var.m6890g(objM11585a);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (zM6890g || objM6869O == i50Var) {
                cz2 cz2Var = objM11585a instanceof cz2 ? (cz2) objM11585a : null;
                C1283w7 c1283w7Mo2974a = cz2Var != null ? cz2Var.mo2974a() : null;
                u33 u33Var = objM11585a instanceof u33 ? (u33) objM11585a : null;
                objM6869O = new C1345xv(c1283w7Mo2974a, u33Var != null ? u33Var.getOnBackPressedDispatcher() : null);
                ir1Var.m6905n0(objM6869O);
            }
            C1345xv c1345xv = (C1345xv) objM6869O;
            long j = ir1Var.f21683T;
            boolean zM6890g2 = ir1Var.m6890g(c1345xv) | ir1Var.m6888f(j);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6890g2 || objM6869O2 == i50Var) {
                C1382yv c1382yv = new C1382yv();
                c1382yv.f35544a = objM11585a;
                c1382yv.f35545b = j;
                VarHandle.storeStoreFence();
                kh0 kh0Var = new kh0(c1382yv);
                kh0Var.f23114o = new C0515c5((byte) 29);
                ir1Var.m6905n0(kh0Var);
                obj = kh0Var;
            }
            kh0 kh0Var2 = (kh0) obj;
            ir1Var.m6885d0(-585307852);
            boolean zM6894i = ir1Var.m6894i(kh0Var2) | ((i2 & 112) == 32);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj2 = objM6869O3;
            if (zM6894i || objM6869O3 == i50Var) {
                C0675g4 c0675g4 = new C0675g4((byte) 6);
                c0675g4.f19600b = kh0Var2;
                c0675g4.f19601c = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0675g4);
                obj2 = c0675g4;
            }
            lb5.m7914W(ir1Var, (wp1) obj2);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean zM6894i2 = ir1Var.m6894i(kh0Var2) | (i3 == 4);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj3 = objM6869O4;
            if (zM6894i2 || objM6869O4 == i50Var) {
                C1419zv c1419zv = new C1419zv(b2);
                c1419zv.f36400c = kh0Var2;
                c1419zv.f36399b = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1419zv);
                obj3 = c1419zv;
            }
            zc6.m13521f(boolValueOf, kh0Var2, null, (yp1) obj3, ir1Var, i3);
            boolean zM6894i3 = ir1Var.m6894i(c1345xv) | ir1Var.m6894i(kh0Var2);
            Object objM6869O5 = ir1Var.m6869O();
            Object obj4 = objM6869O5;
            if (zM6894i3 || objM6869O5 == i50Var) {
                C0558d0 c0558d0 = new C0558d0((byte) 10);
                c0558d0.f16655b = c1345xv;
                c0558d0.f16656c = kh0Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj4 = c0558d0;
            }
            lb5.m7924e(c1345xv, kh0Var2, (yp1) obj4, ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0823k5 c0823k5 = new C0823k5(b);
            c0823k5.f22892b = z;
            c0823k5.f22893c = wp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0823k5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:188:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:191:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:195:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:196:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:200:0x0508  */
    /* JADX WARN: Code duplicated, block: B:202:0x0511  */
    /* JADX WARN: Code duplicated, block: B:203:0x0523  */
    /* JADX WARN: Code duplicated, block: B:206:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x0530  */
    /* JADX WARN: Code duplicated, block: B:213:0x0547  */
    /* JADX WARN: Code duplicated, block: B:216:0x0552  */
    /* JADX WARN: Code duplicated, block: B:219:0x0567  */
    /* JADX WARN: Code duplicated, block: B:221:0x056b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0570  */
    /* JADX WARN: Code duplicated, block: B:225:0x057a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0589  */
    /* JADX WARN: Code duplicated, block: B:231:0x059a  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:235:0x0645  */
    /* JADX WARN: Code duplicated, block: B:238:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:242:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:243:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:246:0x0707  */
    /* JADX WARN: Code duplicated, block: B:247:0x0709  */
    /* JADX WARN: Code duplicated, block: B:250:0x0719  */
    /* JADX WARN: Code duplicated, block: B:251:0x071b  */
    /* JADX WARN: Code duplicated, block: B:254:0x072a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0733  */
    /* JADX WARN: Code duplicated, block: B:258:0x0738  */
    /* JADX WARN: Code duplicated, block: B:261:0x0744 A[PHI: r7 r29 r33
  0x0744: PHI (r7v30 l12) = (r7v19 l12), (r7v31 l12) binds: [B:260:0x0742, B:257:0x0733] A[DONT_GENERATE, DONT_INLINE]
  0x0744: PHI (r29v2 zn0) = (r29v0 zn0), (r29v3 zn0) binds: [B:260:0x0742, B:257:0x0733] A[DONT_GENERATE, DONT_INLINE]
  0x0744: PHI (r33v3 au4) = (r33v1 au4), (r33v4 au4) binds: [B:260:0x0742, B:257:0x0733] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:262:0x0746  */
    /* JADX WARN: Code duplicated, block: B:265:0x0763 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x0769  */
    /* JADX WARN: Code duplicated, block: B:271:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:273:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:279:0x07d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:285:0x083c  */
    /* JADX WARN: Code duplicated, block: B:286:0x084f  */
    /* JADX WARN: Code duplicated, block: B:289:0x089d  */
    /* JADX WARN: Code duplicated, block: B:290:0x089f  */
    /* JADX WARN: Code duplicated, block: B:293:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:294:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:297:0x08bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:301:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:309:0x092e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0935  */
    /* JADX WARN: Code duplicated, block: B:313:0x094d  */
    /* JADX WARN: Code duplicated, block: B:316:0x095c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x095e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0982  */
    /* JADX WARN: Code duplicated, block: B:321:0x0984  */
    /* JADX WARN: Code duplicated, block: B:324:0x098f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0995  */
    /* JADX WARN: Code duplicated, block: B:332:0x09a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:335:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:338:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:339:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:343:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:345:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:349:0x0a1f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:352:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:355:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:361:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:368:0x0aa2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:372:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:380:0x0b65  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m9096b(xk4 xk4Var, yp1 yp1Var, nt2 nt2Var, xl4 xl4Var, xy4 xy4Var, yp1 yp1Var2, ga4 ga4Var, boolean z, int i, int i2, l12 l12Var, ld2 ld2Var, boolean z2, nq1 nq1Var, mi0 mi0Var, int i3, int i4) {
        int i5;
        int i6;
        yp1 yp1Var3;
        boolean z3;
        boolean z4;
        xy4 xy4Var2;
        int i7;
        boolean z5;
        nt2 nt2Var2;
        xl4 xl4Var2;
        ir1 ir1Var;
        C0875lk c0875lk;
        v71 v71Var;
        xl4 xl4Var3;
        boolean z6;
        ky0 ky0Var;
        Object obj;
        ir1 ir1Var2;
        ky0 ky0Var2;
        wj4 wj4Var;
        ky0 ky0Var3;
        long j;
        nh3 nh3Var;
        el4 el4Var;
        ql4 ql4Var;
        String str;
        C0875lk c0875lk2;
        boolean z7;
        boolean z8;
        zn0 zn0Var;
        long j2;
        xk4 xk4VarM12702a;
        xk4 xk4Var2;
        Object objM6869O;
        Object obj2;
        au4 au4Var;
        long jCurrentTimeMillis;
        Object objM6869O2;
        Object obj3;
        zo0 zo0Var;
        Object objM6869O3;
        Object obj4;
        e30 e30Var;
        Object objM6869O4;
        Object obj5;
        pk4 pk4Var;
        vi3 vi3Var;
        zn0 zn0Var2;
        j04 j04Var;
        zm2 zm2Var;
        Context context;
        ro0 ro0Var;
        boolean zM6890g;
        Object obj6;
        int i8;
        boolean z9;
        boolean z10;
        int i9;
        boolean z11;
        int i10;
        l12 l12Var2;
        zn0 zn0Var3;
        au4 au4Var2;
        boolean z12;
        boolean zM6894i;
        Object obj7;
        sw2 sw2VarM7369C;
        boolean zM6890g2;
        Object c0980oe;
        uj2 uj2Var;
        sw2 sw2Var;
        nt2 nt2VarM10029m;
        nt2 nt2VarM10327a;
        ck4 ck4Var;
        boolean z13;
        boolean z14;
        boolean zM6894i2;
        Object obj8;
        jo0 jo0Var;
        yz4 yz4Var;
        jo0 jo0Var2;
        boolean z15;
        nt2 nt2VarM10029m2;
        boolean zM6894i3;
        Object obj9;
        boolean z16;
        boolean z17;
        byte b;
        Object obj10;
        boolean z18;
        int i11;
        boolean z19;
        boolean zBooleanValue;
        boolean zM6892h;
        Object obj11;
        nt2 nt2VarMo7630d;
        t30 t30Var;
        long j3;
        long jM13869d;
        t30 ga4Var2;
        boolean zM6894i4;
        Object obj12;
        boolean z20;
        nt2 nt2Var3;
        Long l;
        long jLongValue;
        ir1 ir1Var3 = (ir1) mi0Var;
        ir1Var3.m6889f0(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (ir1Var3.m6890g(xk4Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= ir1Var3.m6894i(yp1Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= ir1Var3.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= ir1Var3.m6890g(xl4Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= ir1Var3.m6890g(xy4Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= ir1Var3.m6894i(yp1Var2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= ir1Var3.m6890g(null) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= ir1Var3.m6890g(ga4Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= ir1Var3.m6892h(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= ir1Var3.m6886e(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (ir1Var3.m6886e(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= ir1Var3.m6890g(l12Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= ir1Var3.m6890g(ld2Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= ir1Var3.m6892h(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= ir1Var3.m6892h(false) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= ir1Var3.m6894i(nq1Var) ? 131072 : 65536;
        }
        int i12 = i6 | 1572864;
        if (ir1Var3.m6871T(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i12) == 599186) ? false : true)) {
            ir1Var3.m6876Y();
            if ((i3 & 1) != 0 && !ir1Var3.m6856B()) {
                ir1Var3.m6874W();
            }
            ir1Var3.m6913s();
            Object objM6869O5 = ir1Var3.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj13 = objM6869O5;
            if (objM6869O5 == i50Var) {
                jl1 jl1Var = new jl1();
                ir1Var3.m6905n0(jl1Var);
                obj13 = jl1Var;
            }
            jl1 jl1Var2 = (jl1) obj13;
            Object objM6869O6 = ir1Var3.m6869O();
            Object obj14 = objM6869O6;
            if (objM6869O6 == i50Var) {
                oj2 oj2Var = pj2.f27654a;
                C1068qe c1068qe = new C1068qe();
                ir1Var3.m6905n0(c1068qe);
                obj14 = c1068qe;
            }
            C1068qe c1068qe2 = (C1068qe) obj14;
            Object objM6869O7 = ir1Var3.m6869O();
            Object obj15 = objM6869O7;
            if (objM6869O7 == i50Var) {
                bl4 bl4Var = new bl4(c1068qe2);
                ir1Var3.m6905n0(bl4Var);
                obj15 = bl4Var;
            }
            bl4 bl4Var2 = (bl4) obj15;
            ky0 ky0Var4 = (ky0) ir1Var3.m6898k(ij0.f21473h);
            am1 am1Var = (am1) ir1Var3.m6898k(ij0.f21476k);
            long j4 = ((rl4) ir1Var3.m6898k(sl4.f30376a)).f29398b;
            zk1 zk1Var = (zk1) ir1Var3.m6898k(ij0.f21474i);
            yz4 yz4Var2 = (yz4) ir1Var3.m6898k(ij0.f21486u);
            ea4 ea4Var = (ea4) ir1Var3.m6898k(ij0.f21482q);
            d63 d63Var = d63.f16814a;
            ir1Var3.m6885d0(-213744626);
            Object[] objArr = {d63Var};
            yg3 yg3Var = hk4.f20658g;
            boolean zM6886e = ir1Var3.m6886e(d63Var.ordinal());
            Object objM6869O8 = ir1Var3.m6869O();
            byte b2 = 20;
            Object obj16 = objM6869O8;
            if (zM6886e || objM6869O8 == i50Var) {
                C1053q c1053q = new C1053q(b2);
                c1053q.f28113b = d63Var;
                VarHandle.storeStoreFence();
                ir1Var3.m6905n0(c1053q);
                obj16 = c1053q;
            }
            hk4 hk4Var = (hk4) dt0.m4688Q(objArr, yg3Var, (wp1) obj16, ir1Var3, 0);
            ir1Var3.m6912r(false);
            if (((d63) hk4Var.f20664f.getValue()) != d63Var) {
                C1077qn.m9987m("Mismatching scroller orientation; ".concat("only single-line, non-wrap text fields can scroll horizontally"));
                return;
            }
            int i13 = i5 & 14;
            boolean z21 = ((i5 & 57344) == 16384) | (i13 == 4);
            Object objM6869O9 = ir1Var3.m6869O();
            if (z21 || objM6869O9 == i50Var) {
                uo4 uo4VarM4679A = dt0.m4679A(xy4Var, xk4Var.f34341a);
                vi3 vi3Var2 = uo4VarM4679A.f32034b;
                ql4 ql4Var2 = xk4Var.f34343c;
                if (ql4Var2 != null) {
                    long j5 = ql4Var2.f28558a;
                    int i14 = ql4.f28557c;
                    int i15 = (int) (j5 >> 32);
                    vi3Var2.m11898a(i15);
                    int i16 = (int) (j5 & 4294967295L);
                    vi3Var2.m11898a(i16);
                    int iMin = Math.min(i15, i16);
                    int iMax = Math.max(i15, i16);
                    C0801jk c0801jk = new C0801jk(uo4VarM4679A.f32033a);
                    c0801jk.f22346b.add(new C0764ik(new pa4(0L, 0L, (xm1) null, (tm1) null, (um1) null, (bm1) null, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, uj4.f31939c, (m44) null, 61439), iMin, iMax, ""));
                    objM6869O9 = new uo4(c0801jk.m7133b(), vi3Var2);
                } else {
                    objM6869O9 = uo4VarM4679A;
                }
                ir1Var3.m6905n0(objM6869O9);
            } else {
                hk4Var = hk4Var;
                i13 = i13;
            }
            uo4 uo4Var = (uo4) objM6869O9;
            C0875lk c0875lk3 = uo4Var.f32033a;
            vi3 vi3Var3 = uo4Var.f32034b;
            yk3 yk3VarM6855A = ir1Var3.m6855A();
            if (yk3VarM6855A == null) {
                C1077qn.m9989o("no recompose scope found");
                return;
            }
            yk3VarM6855A.f35298b |= 1;
            boolean zM6890g3 = ir1Var3.m6890g(ea4Var);
            Object objM6869O10 = ir1Var3.m6869O();
            v71 v71Var2 = v71.f32439a;
            if (zM6890g3 || objM6869O10 == i50Var) {
                c0875lk = c0875lk3;
                v71Var = v71Var2;
                xl4Var3 = xl4Var;
                z6 = z;
                wj4 wj4Var2 = new wj4(c0875lk, ky0Var4, am1Var, xl4Var3, v71Var, z6);
                uj2 uj2Var2 = new uj2();
                uj2Var2.f31912a = wj4Var2;
                uj2Var2.f31913b = yk3VarM6855A;
                uj2Var2.f31914c = ea4Var;
                nh3 nh3Var2 = new nh3((byte) 14, false);
                C0875lk c0875lk4 = AbstractC0912mk.f24972a;
                ky0Var = ky0Var4;
                long j6 = ql4.f28556b;
                xk4 xk4Var3 = new xk4(c0875lk4, j6, (ql4) null);
                nh3Var2.f25810b = xk4Var3;
                nh3Var2.f25811c = new c71(c0875lk4, xk4Var3.f34342b);
                uj2Var2.f31915d = nh3Var2;
                Boolean bool = Boolean.FALSE;
                uj2Var2.f31917f = k43.m7398w(bool);
                uj2Var2.f31918g = k43.m7398w(p11.m9350a(0.0f));
                uj2Var2.f31920i = k43.m7398w(null);
                uj2Var2.f31922k = k43.m7398w(wu1.f33741a);
                uj2Var2.f31923l = k43.m7398w(bool);
                uj2Var2.f31924m = k43.m7398w(bool);
                uj2Var2.f31925n = k43.m7398w(bool);
                uj2Var2.f31926o = k43.m7398w(bool);
                uj2Var2.f31927p = true;
                uj2Var2.f31928q = k43.m7398w(Boolean.TRUE);
                jp0 jp0Var = new jp0((byte) 25, false);
                jp0Var.f22481b = ea4Var;
                VarHandle.storeStoreFence();
                uj2Var2.f31929r = jp0Var;
                uj2Var2.f31930s = k43.m7398w(bool);
                uj2Var2.f31931t = k43.m7398w(bool);
                uj2Var2.f31932u = new el1((byte) 22);
                zn0 zn0Var4 = new zn0((byte) 1);
                zn0Var4.f36195b = uj2Var2;
                VarHandle.storeStoreFence();
                uj2Var2.f31933v = zn0Var4;
                zn0 zn0Var5 = new zn0((byte) 2);
                zn0Var5.f36195b = uj2Var2;
                VarHandle.storeStoreFence();
                uj2Var2.f31934w = zn0Var5;
                zn0 zn0Var6 = new zn0((byte) 3);
                zn0Var6.f36195b = uj2Var2;
                VarHandle.storeStoreFence();
                uj2Var2.f31935x = zn0Var6;
                uj2Var2.f31936y = c20.m3810e();
                uj2Var2.f31937z = pb0.f27501h;
                uj2Var2.f31910A = k43.m7398w(ql4.m9897a(j6));
                uj2Var2.f31911B = k43.m7398w(ql4.m9897a(j6));
                VarHandle.storeStoreFence();
                ir1 ir1Var4 = ir1Var3;
                ir1Var4.m6905n0(uj2Var2);
                ir1Var2 = ir1Var4;
                obj = uj2Var2;
            } else {
                xl4Var3 = xl4Var;
                c0875lk = c0875lk3;
                obj = objM6869O10;
                ky0Var = ky0Var4;
                v71Var = v71Var2;
                ir1Var2 = ir1Var3;
                z6 = z;
            }
            uj2 uj2Var3 = (uj2) obj;
            C0875lk c0875lk5 = xk4Var.f34341a;
            long j7 = xk4Var.f34342b;
            uj2Var3.f31932u = yp1Var;
            zn0 zn0Var7 = uj2Var3.f31933v;
            uj2Var3.f31937z = j4;
            jp0 jp0Var2 = uj2Var3.f31929r;
            jp0Var2.f22482c = ld2Var;
            jp0Var2.f22483d = zk1Var;
            uj2Var3.f31921j = c0875lk5;
            wj4 wj4Var3 = uj2Var3.f31912a;
            if (z62.m13387o(wj4Var3.f33431a, c0875lk) && z62.m13387o(wj4Var3.f33432b, xl4Var3) && wj4Var3.f33433c == z6) {
                ky0Var2 = ky0Var;
                if (z62.m13387o(wj4Var3.f33434d, ky0Var2) && z62.m13387o(wj4Var3.f33436f, v71Var)) {
                    if (wj4Var3.f33435e != am1Var) {
                        am1Var = am1Var;
                    } else {
                        ky0Var3 = ky0Var2;
                        j = j7;
                        wj4Var = wj4Var3;
                    }
                }
                if (uj2Var3.f31912a != wj4Var) {
                    uj2Var3.f31927p = true;
                }
                uj2Var3.f31912a = wj4Var;
                nh3Var = uj2Var3.f31915d;
                el4Var = uj2Var3.f31916e;
                nh3Var.getClass();
                ql4Var = xk4Var.f34343c;
                boolean zM13387o = z62.m13387o(ql4Var, ((c71) nh3Var.f25811c).m3859c());
                str = ((xk4) nh3Var.f25810b).f34341a.f24092b;
                c0875lk2 = xk4Var.f34341a;
                if (z62.m13387o(str, c0875lk2.f24092b)) {
                    if (ql4.m9899c(((xk4) nh3Var.f25810b).f34342b, j)) {
                        z7 = false;
                    } else {
                        ((c71) nh3Var.f25811c).m3862f(ql4.m9903g(j), ql4.m9902f(j));
                        z7 = false;
                        z8 = true;
                    }
                    if (ql4Var == null) {
                        c71 c71Var = (c71) nh3Var.f25811c;
                        c71Var.f15853d = -1;
                        c71Var.f15854e = -1;
                        zn0Var = zn0Var7;
                    } else {
                        zn0Var = zn0Var7;
                        j2 = ql4Var.f28558a;
                        if (!ql4.m9900d(j2)) {
                            ((c71) nh3Var.f25811c).m3861e(ql4.m9903g(j2), ql4.m9902f(j2));
                        }
                    }
                    if (z7 && (z8 || zM13387o)) {
                        xk4VarM12702a = xk4Var;
                    } else {
                        c71 c71Var2 = (c71) nh3Var.f25811c;
                        c71Var2.f15853d = -1;
                        c71Var2.f15854e = -1;
                        xk4VarM12702a = xk4.m12702a(xk4Var, null, 0L, 3);
                    }
                    xk4Var2 = (xk4) nh3Var.f25810b;
                    nh3Var.f25810b = xk4VarM12702a;
                    if (el4Var != null) {
                        el4Var.m5192a(xk4Var2, xk4VarM12702a);
                    }
                    objM6869O = ir1Var2.m6869O();
                    obj2 = objM6869O;
                    if (objM6869O == i50Var) {
                        au4 au4Var3 = new au4();
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(au4Var3);
                        obj2 = au4Var3;
                    }
                    au4Var = (au4) obj2;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (au4Var.f14885e) {
                        au4Var.f14884d = Long.valueOf(jCurrentTimeMillis);
                        au4Var.m3314a(xk4Var);
                    } else {
                        l = au4Var.f14884d;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        if (jCurrentTimeMillis > jLongValue + 5000) {
                            au4Var.f14884d = Long.valueOf(jCurrentTimeMillis);
                            au4Var.m3314a(xk4Var);
                        }
                    }
                    objM6869O2 = ir1Var2.m6869O();
                    obj3 = objM6869O2;
                    if (objM6869O2 == i50Var) {
                        zo0 zo0VarM7942w = lb5.m7942w(r71.f29063a, ir1Var2);
                        ir1Var2.m6905n0(zo0VarM7942w);
                        obj3 = zo0VarM7942w;
                    }
                    zo0Var = (zo0) obj3;
                    objM6869O3 = ir1Var2.m6869O();
                    obj4 = objM6869O3;
                    if (objM6869O3 == i50Var) {
                        e30 e30Var2 = new e30();
                        e30Var2.f17658a = new uw2(new f30[16]);
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(e30Var2);
                        obj4 = e30Var2;
                    }
                    e30Var = (e30) obj4;
                    objM6869O4 = ir1Var2.m6869O();
                    if (objM6869O4 == i50Var) {
                        pk4 pk4Var2 = new pk4();
                        pk4Var2.f27693a = au4Var;
                        pk4Var2.f27694b = dt0.f17357o;
                        pk4Var2.f27695c = new r54((byte) 23);
                        pk4Var2.f27697e = k43.m7398w(new xk4(7, 0L, (String) null));
                        Boolean bool2 = Boolean.TRUE;
                        pk4Var2.f27704l = k43.m7398w(bool2);
                        pk4Var2.f27705m = k43.m7398w(bool2);
                        pk4Var2.f27706n = 0L;
                        pk4Var2.f27708p = 0L;
                        pk4Var2.f27709q = k43.m7398w(null);
                        pk4Var2.f27710r = k43.m7398w(null);
                        pk4Var2.f27711s = -1;
                        pk4Var2.f27712t = new xk4(7, 0L, (String) null);
                        pk4Var2.f27715w = k43.m7398w(Boolean.FALSE);
                        yg3 yg3Var2 = new yg3((byte) 6);
                        yg3Var2.f35216c = un4.f32015a;
                        pk4Var2.f27716x = yg3Var2;
                        nk4 nk4Var = new nk4();
                        nk4Var.f25918d = pk4Var2;
                        nk4Var.f25915a = true;
                        nk4Var.f25917c = wv1.f33773p;
                        VarHandle.storeStoreFence();
                        pk4Var2.f27717y = nk4Var;
                        rd6 rd6Var = new rd6((byte) 4);
                        rd6Var.f29198d = pk4Var2;
                        rd6Var.f29196b = true;
                        VarHandle.storeStoreFence();
                        pk4Var2.f27718z = rd6Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(pk4Var2);
                        obj5 = pk4Var2;
                    } else {
                        obj5 = objM6869O4;
                    }
                    pk4Var = (pk4) obj5;
                    vi3Var = vi3Var3;
                    pk4Var.f27694b = vi3Var;
                    zn0Var2 = zn0Var;
                    pk4Var.f27695c = zn0Var2;
                    pk4Var.f27696d = uj2Var3;
                    pk4Var.f27697e.setValue(xk4Var);
                    pk4Var.f27714v = ql4.m9897a(j);
                    pk4Var.f27699g = (ha0) ir1Var2.m6898k(ij0.f21471f);
                    pk4Var.f27700h = zo0Var;
                    pk4Var.f27702j = (fv1) ir1Var2.m6898k(ij0.f21477l);
                    pk4Var.f27703k = jl1Var2;
                    pk4Var.f27704l.setValue(true);
                    pk4Var.f27705m.setValue(Boolean.valueOf(z2));
                    ir1Var2.m6885d0(1966756105);
                    j04Var = j04.f21933a;
                    zm2Var = xl4Var3.f34389a.f27488k;
                    nc4 nc4Var = ub3.f31776a;
                    ky0 ky0Var5 = ky0Var3;
                    ir1Var2.m6885d0(430530635);
                    context = (Context) ir1Var2.m6898k(AndroidCompositionLocals_androidKt.f14651b);
                    ro0Var = (ro0) ir1Var2.m6898k(ub3.f31776a);
                    zM6890g = ir1Var2.m6890g(ro0Var) | ir1Var2.m6890g(context) | ir1Var2.m6890g(zm2Var);
                    Object objM6869O11 = ir1Var2.m6869O();
                    obj6 = objM6869O11;
                    if (zM6890g || objM6869O11 == i50Var) {
                        tb3 tb3Var = (tb3) ub3.f31777b.mo183g(ro0Var, context, j04Var, zm2Var);
                        ir1Var2.m6905n0(tb3Var);
                        obj6 = tb3Var;
                    }
                    ir1Var2.m6912r(false);
                    pk4Var.f27701i = (tb3) obj6;
                    ir1Var2.m6912r(false);
                    uj2Var3.m11575b();
                    boolean zM6894i5 = ir1Var2.m6894i(uj2Var3);
                    i8 = i12 & 7168;
                    if (i8 == 2048) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z22 = zM6894i5 | z9;
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean zM6894i6 = z22 | z10 | ir1Var2.m6894i(bl4Var2);
                    i9 = i13;
                    if (i9 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z23 = zM6894i6 | z11;
                    i10 = (i12 & 112) ^ 48;
                    if (i10 > 32) {
                        l12Var2 = l12Var;
                        if (!ir1Var2.m6890g(l12Var2)) {
                            au4Var2 = au4Var;
                            zn0Var3 = zn0Var2;
                        }
                        z12 = true;
                        zM6894i = z23 | z12 | ir1Var2.m6894i(vi3Var) | ir1Var2.m6894i(zo0Var) | ir1Var2.m6894i(e30Var) | ir1Var2.m6894i(pk4Var);
                        Object objM6869O12 = ir1Var2.m6869O();
                        if (!zM6894i || objM6869O12 == i50Var) {
                            co0 co0Var = new co0();
                            co0Var.f16168a = uj2Var3;
                            z3 = z2;
                            co0Var.f16169b = z3;
                            co0Var.f16170c = bl4Var2;
                            co0Var.f16171d = xk4Var;
                            co0Var.f16172e = l12Var2;
                            co0Var.f16173f = vi3Var;
                            co0Var.f16174g = pk4Var;
                            co0Var.f16175h = zo0Var;
                            co0Var.f16176i = e30Var;
                            VarHandle.storeStoreFence();
                            ir1Var2.m6905n0(co0Var);
                            obj7 = co0Var;
                        } else {
                            z3 = z2;
                            obj7 = objM6869O12;
                        }
                        nt2 nt2VarM11860s = vd6.m11860s(d24.m4290E(zc6.m13539z(jl1Var2), (yp1) obj7), z3, null);
                        sw2VarM7369C = k43.m7369C(Boolean.valueOf(z3), ir1Var2);
                        zM6890g2 = ir1Var2.m6890g(sw2VarM7369C) | ir1Var2.m6894i(uj2Var3) | ir1Var2.m6894i(bl4Var2) | ir1Var2.m6894i(pk4Var) | ((i10 <= 32 && ir1Var2.m6890g(l12Var2)) || (i12 & 48) == 32);
                        Object objM6869O13 = ir1Var2.m6869O();
                        if (!zM6890g2 || objM6869O13 == i50Var) {
                            c0980oe = new C0980oe(uj2Var3, sw2VarM7369C, bl4Var2, pk4Var, l12Var, null, (byte) 4);
                            uj2Var = uj2Var3;
                            sw2Var = sw2VarM7369C;
                            ir1Var2.m6905n0(c0980oe);
                        } else {
                            sw2Var = sw2VarM7369C;
                            uj2Var = uj2Var3;
                            c0980oe = objM6869O13;
                        }
                        lb5.m7926g(ir1Var2, (mq1) c0980oe, ju4.f22634a);
                        zn0 zn0Var8 = new zn0((byte) 4);
                        zn0Var8.f36195b = uj2Var;
                        VarHandle.storeStoreFence();
                        C1252vd c1252vd = new C1252vd((byte) 3);
                        c1252vd.f32529b = zn0Var8;
                        VarHandle.storeStoreFence();
                        nt2VarM10029m = kt2.f23428a;
                        nt2VarM10327a = rf4.m10327a(nt2VarM10029m, 8675309, c1252vd);
                        ck4Var = new ck4();
                        ck4Var.f16087a = uj2Var;
                        ck4Var.f16088b = jl1Var2;
                        ck4Var.f16089c = z3;
                        ck4Var.f16090d = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0833: IPUT (r19v3 java.lang.Object), (r6v30 'ck4Var' ck4) ck4.d pk4 in method: oh6.b(xk4, yp1, nt2, xl4, xy4, yp1, ga4, boolean, int, int, l12, ld2, boolean, nq1, mi0, int, int):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v3 java.lang.Object
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 3120
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.oh6.m9096b(xk4, yp1, nt2, xl4, xy4, yp1, ga4, boolean, int, int, l12, ld2, boolean, nq1, mi0, int, int):void");
                    }

                    /* JADX INFO: renamed from: c */
                    public static final void m9097c(nt2 nt2Var, pk4 pk4Var, pg0 pg0Var, mi0 mi0Var, int i) {
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(2036174316);
                        int i2 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2) | (ir1Var.m6894i(pk4Var) ? 32 : 16);
                        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
                            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
                            int iHashCode = Long.hashCode(ir1Var.f21683T);
                            ga3 ga3VarM6902m = ir1Var.m6902m();
                            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
                            bi0.f15310ap.getClass();
                            if (ir1Var.f21685a == null) {
                                dt0.m4682E();
                                throw null;
                            }
                            ir1Var.m6893h0();
                            if (ir1Var.f21682S) {
                                ir1Var.m6900l(wf2.f33290T);
                            } else {
                                ir1Var.m6911q0();
                            }
                            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                            C0006a5.m50F(ir1Var);
                            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                            d24.m4300a(pk4Var, pg0Var, ir1Var, (i2 >> 3) & 126);
                            ir1Var.m6912r(true);
                        } else {
                            ir1Var.m6874W();
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            C0712h4 c0712h4 = new C0712h4((byte) 5);
                            c0712h4.f20357b = nt2Var;
                            c0712h4.f20358c = pk4Var;
                            c0712h4.f20359d = pg0Var;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = c0712h4;
                        }
                    }

                    /* JADX INFO: renamed from: d */
                    public static final ly0 m9098d(float f, float f2) {
                        ly0 ly0Var = new ly0();
                        ly0Var.f24459a = f;
                        ly0Var.f24460b = f2;
                        VarHandle.storeStoreFence();
                        return ly0Var;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: e */
                    public static final void m9099e(sp1 sp1Var, pz2 pz2Var, int i, mi0 mi0Var, int i2) {
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(-2118019290);
                        byte b = 4;
                        int i3 = i2 | (ir1Var.m6890g(sp1Var) ? 4 : 2) | (ir1Var.m6890g(pz2Var) ? 32 : 16) | 384;
                        if (ir1Var.m6871T(i3 & 1, (i3 & 147) != 146)) {
                            Object objM6869O = ir1Var.m6869O();
                            i50 i50Var = ki0.f23136a;
                            if (objM6869O == i50Var) {
                                objM6869O = new a83(0);
                                ir1Var.m6905n0(objM6869O);
                            }
                            a83 a83Var = (a83) objM6869O;
                            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                            Object objM6869O2 = ir1Var.m6869O();
                            if (z || objM6869O2 == i50Var) {
                                C0671g0 c0671g0 = new C0671g0(pz2Var, sp1Var, a83Var, null, (byte) 23);
                                ir1Var.m6905n0(c0671g0);
                                objM6869O2 = c0671g0;
                            }
                            lb5.m7928i(sp1Var, pz2Var, 4, (mq1) objM6869O2, ir1Var);
                        } else {
                            ir1Var.m6874W();
                            b = i;
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            dp1 dp1Var = new dp1();
                            dp1Var.f17251a = sp1Var;
                            dp1Var.f17252b = pz2Var;
                            dp1Var.f17253c = b;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = dp1Var;
                        }
                    }

                    /* JADX INFO: renamed from: f */
                    public static final void m9100f(pk4 pk4Var, boolean z, mi0 mi0Var, int i) {
                        kl4 kl4VarM11577d;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(626339208);
                        byte b = 4;
                        int i2 = i | (ir1Var.m6894i(pk4Var) ? 4 : 2) | (ir1Var.m6892h(z) ? 32 : 16);
                        if (!ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
                            ir1Var.m6874W();
                        } else if (z) {
                            ir1Var.m6885d0(1530097388);
                            uj2 uj2Var = pk4Var.f27696d;
                            jl4 jl4Var = null;
                            if (uj2Var != null && (kl4VarM11577d = uj2Var.m11577d()) != null) {
                                jl4 jl4Var2 = kl4VarM11577d.f23216a;
                                uj2 uj2Var2 = pk4Var.f27696d;
                                if (!(uj2Var2 != null ? uj2Var2.f31927p : true)) {
                                    jl4Var = jl4Var2;
                                }
                            }
                            if (jl4Var == null) {
                                ir1Var.m6885d0(1530097387);
                                ir1Var.m6912r(false);
                            } else {
                                ir1Var.m6885d0(1530097388);
                                if (ql4.m9900d(pk4Var.m9550l().f34342b)) {
                                    ir1Var.m6885d0(2110860558);
                                    ir1Var.m6912r(false);
                                } else {
                                    ir1Var.m6885d0(2109807302);
                                    vi3 vi3Var = pk4Var.f27694b;
                                    int i3 = (int) (pk4Var.m9550l().f34342b >> 32);
                                    vi3Var.m11898a(i3);
                                    vi3 vi3Var2 = pk4Var.f27694b;
                                    int i4 = (int) (pk4Var.m9550l().f34342b & 4294967295L);
                                    vi3Var2.m11898a(i4);
                                    oo3 oo3VarM7175a = jl4Var.m7175a(i3);
                                    oo3 oo3VarM7175a2 = jl4Var.m7175a(Math.max(i4 - 1, 0));
                                    uj2 uj2Var3 = pk4Var.f27696d;
                                    if (uj2Var3 == null || !((Boolean) uj2Var3.f31924m.getValue()).booleanValue()) {
                                        ir1Var.m6885d0(2110490542);
                                        ir1Var.m6912r(false);
                                    } else {
                                        ir1Var.m6885d0(2110225306);
                                        y70.m13023c(true, oo3VarM7175a, pk4Var, ir1Var, ((i2 << 6) & 896) | 6);
                                        ir1Var.m6912r(false);
                                    }
                                    uj2 uj2Var4 = pk4Var.f27696d;
                                    if (uj2Var4 == null || !((Boolean) uj2Var4.f31925n.getValue()).booleanValue()) {
                                        ir1Var.m6885d0(2110838734);
                                        ir1Var.m6912r(false);
                                    } else {
                                        ir1Var.m6885d0(2110574459);
                                        y70.m13023c(false, oo3VarM7175a2, pk4Var, ir1Var, ((i2 << 6) & 896) | 6);
                                        ir1Var.m6912r(false);
                                    }
                                    ir1Var.m6912r(false);
                                }
                                uj2 uj2Var5 = pk4Var.f27696d;
                                if (uj2Var5 != null) {
                                    d83 d83Var = uj2Var5.f31923l;
                                    if (!z62.m13387o(pk4Var.f27712t.f34341a.f24092b, pk4Var.m9550l().f34341a.f24092b)) {
                                        d83Var.setValue(Boolean.FALSE);
                                    }
                                    if (uj2Var5.m11575b()) {
                                        if (((Boolean) d83Var.getValue()).booleanValue()) {
                                            pk4Var.m9557s();
                                        } else {
                                            pk4Var.m9551m();
                                        }
                                    }
                                }
                                ir1Var.m6912r(false);
                            }
                            ir1Var.m6912r(false);
                        } else {
                            ir1Var.m6885d0(1989076778);
                            ir1Var.m6912r(false);
                            pk4Var.m9551m();
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            C0823k5 c0823k5 = new C0823k5(b);
                            c0823k5.f22893c = pk4Var;
                            c0823k5.f22892b = z;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = c0823k5;
                        }
                    }

                    /* JADX INFO: renamed from: g */
                    public static final void m9101g(od1 od1Var, boolean z, yp1 yp1Var, mi0 mi0Var, int i) {
                        yp1 yp1Var2;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(-2068392149);
                        int i2 = i | 178;
                        byte b = 0;
                        int i3 = 1;
                        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
                            ir1Var.m6876Y();
                            int i4 = i & 1;
                            wm0 wm0Var = null;
                            i50 i50Var = ki0.f23136a;
                            if (i4 == 0 || ir1Var.m6856B()) {
                                od1Var = (od1) ir1Var.m6898k(pd1.m9499d());
                                Object objM6869O = ir1Var.m6869O();
                                if (objM6869O == i50Var) {
                                    objM6869O = new fe0(i3, wm0Var, b);
                                    ir1Var.m6905n0(objM6869O);
                                }
                                yp1Var2 = (yp1) objM6869O;
                                z = true;
                            } else {
                                ir1Var.m6874W();
                                yp1Var2 = yp1Var;
                            }
                            ir1Var.m6913s();
                            boolean zM13387o = z62.m13387o((Boolean) od1Var.f26640e.getValue(), Boolean.TRUE);
                            od1 od1Var2 = (od1) ir1Var.m6898k(pd1.m9499d());
                            Object[] objArr = new Object[0];
                            Object objM6869O2 = ir1Var.m6869O();
                            if (objM6869O2 == i50Var) {
                                objM6869O2 = new C0515c5((byte) 23);
                                ir1Var.m6905n0(objM6869O2);
                            }
                            sw2 sw2Var = (sw2) qw3.m10147c(objArr, null, (wp1) objM6869O2, ir1Var, 6);
                            pw3 pw3VarM10148d = qw3.m10148d(ir1Var);
                            ie0 ie0Var = new ie0(b);
                            ie0Var.f21278b = pw3VarM10148d;
                            ie0Var.f21279c = od1Var2;
                            ie0Var.f21280d = yp1Var2;
                            ie0Var.f21281e = sw2Var;
                            VarHandle.storeStoreFence();
                            mz3.m8466h(zM13387o, ie0Var, null, null, z, null, null, y62.f34944v, null, ir1Var, 14180352, 812);
                        } else {
                            ir1Var.m6874W();
                            yp1Var2 = yp1Var;
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            ae0 ae0Var = new ae0((byte) 2);
                            ae0Var.f14401c = od1Var;
                            ae0Var.f14400b = z;
                            ae0Var.f14402d = yp1Var2;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = ae0Var;
                        }
                    }

                    /* JADX INFO: renamed from: h */
                    public static final void m9102h(C0954np c0954np, nt2 nt2Var, yp1 yp1Var, yp1 yp1Var2, InterfaceC0520ca interfaceC0520ca, jm0 jm0Var, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
                        int i3;
                        int i4;
                        yp1 yp1Var3;
                        pg0 pg0Var2;
                        jm0 jm0Var2;
                        InterfaceC0520ca interfaceC0520ca2;
                        yp1 yp1Var4;
                        nt2 nt2Var2 = nt2Var;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(-605638725);
                        if ((i & 14) == 0) {
                            i3 = (ir1Var.m6890g(c0954np) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        if ((i & 112) == 0) {
                            i3 |= ir1Var.m6890g(null) ? 32 : 16;
                        }
                        if ((i & 896) == 0) {
                            i3 |= ir1Var.m6890g(nt2Var2) ? 256 : 128;
                        }
                        if ((i & 7168) == 0) {
                            i3 |= ir1Var.m6894i(yp1Var) ? 2048 : 1024;
                        }
                        if ((57344 & i) == 0) {
                            i3 |= ir1Var.m6894i(yp1Var2) ? 16384 : 8192;
                        }
                        if ((458752 & i) == 0) {
                            i3 |= ir1Var.m6890g(interfaceC0520ca) ? 131072 : 65536;
                        }
                        if ((3670016 & i) == 0) {
                            i3 |= ir1Var.m6890g(jm0Var) ? 1048576 : 524288;
                        }
                        if ((29360128 & i) == 0) {
                            i3 |= ir1Var.m6884d(1.0f) ? 8388608 : 4194304;
                        }
                        if ((234881024 & i) == 0) {
                            i3 |= ir1Var.m6890g(null) ? 67108864 : 33554432;
                        }
                        byte b = 1;
                        if ((1879048192 & i) == 0) {
                            i3 |= ir1Var.m6886e(1) ? 536870912 : 268435456;
                        }
                        if ((i2 & 14) == 0) {
                            i4 = (ir1Var.m6892h(true) ? 4 : 2) | i2;
                        } else {
                            i4 = i2;
                        }
                        if ((i2 & 112) == 0) {
                            i4 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
                        }
                        int i5 = i4;
                        if ((1533916891 & i3) == 306783378 && (i5 & 91) == 18 && ir1Var.m6858D()) {
                            ir1Var.m6874W();
                            yp1Var3 = yp1Var;
                            jm0Var2 = jm0Var;
                            interfaceC0520ca2 = interfaceC0520ca;
                            yp1Var4 = yp1Var2;
                        } else {
                            b12 b12VarM5839b = fw4.m5839b(c0954np.f25988a, jm0Var, ir1Var);
                            int i6 = i3;
                            int i7 = i6 >> 6;
                            int i8 = i6 >> 12;
                            C0880lp c0880lpM10794C = sj3.m10794C(b12VarM5839b, c0954np.f25990c, yp1Var, yp1Var2, jm0Var, ir1Var, 64);
                            yp1Var3 = yp1Var;
                            p74 p74Var = b12VarM5839b.f15017v;
                            boolean z = p74Var instanceof nl0;
                            i50 i50Var = ki0.f23136a;
                            if (z) {
                                ir1Var.m6887e0(-2079329304);
                                l64 l64Var = new l64(b);
                                l64Var.f23821b = p74Var;
                                l64Var.f23822c = pg0Var;
                                l64Var.f23823d = c0880lpM10794C;
                                l64Var.f23824e = interfaceC0520ca;
                                l64Var.f23825f = jm0Var;
                                VarHandle.storeStoreFence();
                                ir1Var.m6879a0(Integer.rotateLeft(-888190719, 1), vd6.f32539b);
                                Object objM6869O = ir1Var.m6869O();
                                if (objM6869O == i50Var) {
                                    pg0Var2 = new pg0(-888190719, true, l64Var);
                                    ir1Var.m6905n0(pg0Var2);
                                } else {
                                    pg0Var2 = (pg0) objM6869O;
                                    pg0Var2.m9520l(l64Var);
                                }
                                ir1Var.m6912r(false);
                                nt2Var2 = nt2Var;
                                jm0Var2 = jm0Var;
                                interfaceC0520ca2 = interfaceC0520ca;
                                yp1Var4 = yp1Var2;
                                i25.m6609a(nt2Var2, interfaceC0520ca2, true, pg0Var2, ir1Var, (i7 & 14) | 3456 | (i8 & 112), 0);
                                ir1Var = ir1Var;
                                ir1Var.m6912r(false);
                            } else {
                                ir1Var.m6887e0(-2080018031);
                                ir1Var.m6887e0(733328855);
                                int i9 = (((((i7 & 14) | 384) | (i8 & 112)) >> 3) & 14) | 48;
                                lw2 lw2Var = q20.f28154a;
                                z62.m13387o(interfaceC0520ca, ig1.f21378b);
                                ir1Var.m6885d0(244380021);
                                boolean z2 = (((i9 & 14) ^ 6) > 4 && ir1Var.m6890g(interfaceC0520ca)) || (i9 & 6) == 4;
                                Object objM6869O2 = ir1Var.m6869O();
                                if (z2 || objM6869O2 == i50Var) {
                                    objM6869O2 = new s20(interfaceC0520ca, true);
                                    ir1Var.m6905n0(objM6869O2);
                                }
                                s20 s20Var = (s20) objM6869O2;
                                ir1Var.m6912r(false);
                                ir1Var.m6887e0(-1323940314);
                                int iHashCode = Long.hashCode(ir1Var.f21683T);
                                ga3 ga3VarM6902m = ir1Var.m6902m();
                                bi0.f15310ap.getClass();
                                cx0 cx0Var = new cx0((byte) 2);
                                cx0Var.f16562b = nt2Var2;
                                VarHandle.storeStoreFence();
                                pg0 pg0Var3 = new pg0(-511438721, true, cx0Var);
                                if (ir1Var.f21685a == null) {
                                    dt0.m4682E();
                                    throw null;
                                }
                                ir1Var.m6893h0();
                                if (ir1Var.f21682S) {
                                    ir1Var.m6900l(wf2.f33290T);
                                } else {
                                    ir1Var.m6911q0();
                                }
                                C0006a5.m53I(ir1Var, ia5.f21216g, s20Var);
                                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                                jh0 jh0Var = ia5.f21217h;
                                if (ir1Var.f21682S || !z62.m13387o(ir1Var.m6869O(), Integer.valueOf(iHashCode))) {
                                    ir1Var.m6905n0(Integer.valueOf(iHashCode));
                                    ir1Var.m6880b(jh0Var, Integer.valueOf(iHashCode));
                                }
                                r74 r74Var = new r74();
                                r74Var.f29073a = ir1Var;
                                VarHandle.storeStoreFence();
                                pg0Var3.invoke(r74Var, ir1Var, 0);
                                ir1Var.m6887e0(2058660585);
                                pg0Var.invoke(new vk3(ia5.f21211b, c0880lpM10794C, interfaceC0520ca, jm0Var), ir1Var, Integer.valueOf(i5 & 112));
                                ir1Var.m6912r(false);
                                ir1Var.m6912r(true);
                                ir1Var.m6912r(false);
                                ir1Var.m6912r(false);
                                ir1Var.m6912r(false);
                                nt2Var2 = nt2Var;
                                jm0Var2 = jm0Var;
                                interfaceC0520ca2 = interfaceC0520ca;
                                yp1Var4 = yp1Var2;
                            }
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            zd4 zd4Var = new zd4();
                            zd4Var.f35998a = c0954np;
                            zd4Var.f35999b = nt2Var2;
                            zd4Var.f36000c = yp1Var3;
                            zd4Var.f36001d = yp1Var4;
                            zd4Var.f36002e = interfaceC0520ca2;
                            zd4Var.f36003f = jm0Var2;
                            zd4Var.f36004g = pg0Var;
                            zd4Var.f36005h = i;
                            zd4Var.f36006i = i2;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = zd4Var;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: i */
                    public static final void m9103i(vk3 vk3Var, nt2 nt2Var, i73 i73Var, InterfaceC0520ca interfaceC0520ca, jm0 jm0Var, float f, o00 o00Var, boolean z, mi0 mi0Var, int i, int i2) {
                        int i3;
                        o00 o00Var2;
                        InterfaceC0520ca interfaceC0520ca2;
                        jm0 jm0Var2;
                        nt2 nt2Var2;
                        float f2;
                        boolean z2;
                        o00 o00Var3;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(880638523);
                        if ((i & 14) == 0) {
                            i3 = (ir1Var.m6890g(vk3Var) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        int i4 = i3 | 176;
                        if ((i & 7168) == 0) {
                            i4 = i3 | 1200;
                        }
                        if ((57344 & i) == 0) {
                            i4 |= 8192;
                        }
                        if ((458752 & i) == 0) {
                            i4 |= 65536;
                        }
                        if ((3670016 & i) == 0) {
                            i4 |= 524288;
                        }
                        if ((29360128 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                o00Var2 = o00Var;
                                int i5 = ir1Var.m6890g(o00Var2) ? 8388608 : 4194304;
                                i4 |= i5;
                            } else {
                                o00Var2 = o00Var;
                            }
                            i4 |= i5;
                        } else {
                            o00Var2 = o00Var;
                        }
                        if ((234881024 & i) == 0) {
                            i4 |= 33554432;
                        }
                        if ((i4 & 191739611) == 38347922 && ir1Var.m6858D()) {
                            ir1Var.m6874W();
                            nt2Var2 = nt2Var;
                            interfaceC0520ca2 = interfaceC0520ca;
                            jm0Var2 = jm0Var;
                            f2 = f;
                            z2 = z;
                            o00Var3 = o00Var2;
                        } else {
                            ir1Var.m6876Y();
                            if ((i & 1) == 0 || ir1Var.m6856B()) {
                                i73Var = vk3Var.f32702b;
                                vk3Var.getClass();
                                interfaceC0520ca2 = vk3Var.f32703c;
                                jm0Var2 = vk3Var.f32704d;
                                vk3Var.getClass();
                                if ((i2 & 64) != 0) {
                                    vk3Var.getClass();
                                    o00Var2 = null;
                                }
                                vk3Var.getClass();
                                nt2Var2 = kt2.f23428a;
                                f2 = 1.0f;
                                z2 = true;
                            } else {
                                ir1Var.m6874W();
                                nt2Var2 = nt2Var;
                                i73Var = i73Var;
                                interfaceC0520ca2 = interfaceC0520ca;
                                jm0Var2 = jm0Var;
                                f2 = f;
                                z2 = z;
                            }
                            ir1Var.m6913s();
                            sk3 sk3Var = fw4.f19357b;
                            nt2 nt2VarMo7630d = (z2 ? i25.m6620n(nt2Var2) : nt2Var2).mo7630d(new gm0(i73Var, interfaceC0520ca2, jm0Var2, f2, o00Var2));
                            C1180tf c1180tf = C1180tf.f31108j;
                            ir1Var.m6887e0(544976794);
                            int iHashCode = Long.hashCode(ir1Var.f21683T);
                            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d);
                            ga3 ga3VarM6902m = ir1Var.m6902m();
                            bi0.f15310ap.getClass();
                            ir1Var.m6887e0(1405779621);
                            if (ir1Var.f21685a == null) {
                                dt0.m4682E();
                                throw null;
                            }
                            ir1Var.m6893h0();
                            o00 o00Var4 = o00Var2;
                            int i6 = 0;
                            if (ir1Var.f21682S) {
                                ir1Var.m6900l(new b41(i6, (byte) 5));
                            } else {
                                ir1Var.m6911q0();
                            }
                            C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                            jh0 jh0Var = ia5.f21217h;
                            if (ir1Var.f21682S || !z62.m13387o(ir1Var.m6869O(), Integer.valueOf(iHashCode))) {
                                ir1Var.m6905n0(Integer.valueOf(iHashCode));
                                ir1Var.m6880b(jh0Var, Integer.valueOf(iHashCode));
                            }
                            ir1Var.m6912r(true);
                            ir1Var.m6912r(false);
                            ir1Var.m6912r(false);
                            o00Var3 = o00Var4;
                        }
                        i73 i73Var2 = i73Var;
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            yd4 yd4Var = new yd4();
                            yd4Var.f35135a = vk3Var;
                            yd4Var.f35136b = nt2Var2;
                            yd4Var.f35137c = i73Var2;
                            yd4Var.f35138d = interfaceC0520ca2;
                            yd4Var.f35139e = jm0Var2;
                            yd4Var.f35140f = f2;
                            yd4Var.f35141g = o00Var3;
                            yd4Var.f35142h = z2;
                            yd4Var.f35143i = i;
                            yd4Var.f35144j = i2;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = yd4Var;
                        }
                    }

                    /* JADX INFO: renamed from: j */
                    public static final void m9104j(boolean z, mq1 mq1Var, boolean z2, xf4 xf4Var, nv2 nv2Var, mi0 mi0Var, int i) {
                        int i2;
                        boolean z3;
                        long j;
                        long j2;
                        p44 p44Var;
                        long j3;
                        long j4;
                        long j5;
                        mq1 mq1Var2 = mq1Var;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(-263339167);
                        if ((i & 6) == 0) {
                            i2 = (ir1Var.m6892h(z) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= ir1Var.m6894i(null) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= ir1Var.m6890g(kt2.f23428a) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= ir1Var.m6894i(mq1Var2) ? 2048 : 1024;
                        }
                        int i3 = i2 | 24576;
                        if ((196608 & i) == 0) {
                            i3 |= ir1Var.m6890g(xf4Var) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            i3 |= ir1Var.m6890g(nv2Var) ? 1048576 : 524288;
                        }
                        boolean z4 = true;
                        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
                            ir1Var.m6876Y();
                            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                                ir1Var.m6874W();
                                z4 = z2;
                            }
                            ir1Var.m6913s();
                            p44 p44VarM10977a = t44.m10977a(6, ir1Var);
                            p44 p44VarM10977a2 = t44.m10977a(6, ir1Var);
                            if (z4) {
                                j = z ? xf4Var.f34237a : xf4Var.f34241e;
                            } else {
                                j = z ? xf4Var.f34245i : xf4Var.f34249m;
                            }
                            if (z4) {
                                j2 = z ? xf4Var.f34240d : xf4Var.f34244h;
                            } else {
                                j2 = z ? xf4Var.f34248l : xf4Var.f34252p;
                            }
                            if (z4) {
                                p44Var = p44VarM10977a;
                                j3 = z ? xf4Var.f34238b : xf4Var.f34242f;
                            } else {
                                p44Var = p44VarM10977a;
                                j3 = z ? xf4Var.f34246j : xf4Var.f34250n;
                            }
                            if (z4) {
                                j4 = j3;
                                j5 = z ? xf4Var.f34239c : xf4Var.f34243g;
                            } else {
                                j4 = j3;
                                j5 = z ? xf4Var.f34247k : xf4Var.f34251o;
                            }
                            z3 = z4;
                            long j6 = j5;
                            mq1Var2 = mq1Var;
                            m9105k(z, z3, mq1Var2, p44Var, p44VarM10977a2, j, j2, j4, j6, nv2Var, ir1Var, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 << 6) & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 57344), (i3 >> 15) & 112);
                        } else {
                            ir1Var.m6874W();
                            z3 = z2;
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            zf4 zf4Var = new zf4();
                            zf4Var.f36049a = z;
                            zf4Var.f36050b = mq1Var2;
                            zf4Var.f36051c = z3;
                            zf4Var.f36052d = xf4Var;
                            zf4Var.f36053e = nv2Var;
                            zf4Var.f36054f = i;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = zf4Var;
                        }
                    }

                    /* JADX INFO: renamed from: k */
                    public static final void m9105k(boolean z, boolean z2, mq1 mq1Var, p44 p44Var, p44 p44Var2, long j, long j2, long j3, long j4, nv2 nv2Var, mi0 mi0Var, int i, int i2) {
                        int i3;
                        long j5;
                        int i4;
                        mq1 mq1Var2;
                        nv2 nv2Var2;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(366684679);
                        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
                        int i5 = i & 6;
                        kt2 kt2Var = kt2.f23428a;
                        if (i5 == 0) {
                            i3 = (ir1Var.m6890g(kt2Var) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        if ((i & 48) == 0) {
                            i3 |= ir1Var.m6894i(null) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i3 |= ir1Var.m6892h(z) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i3 |= ir1Var.m6892h(z2) ? 2048 : 1024;
                        }
                        if ((i & 24576) == 0) {
                            i3 |= ir1Var.m6894i(mq1Var) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            i3 |= ir1Var.m6890g(p44Var) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            i3 |= ir1Var.m6890g(p44Var2) ? 1048576 : 524288;
                        }
                        if ((12582912 & i) == 0) {
                            i3 |= ir1Var.m6888f(j) ? 8388608 : 4194304;
                        }
                        if ((100663296 & i) == 0) {
                            i3 |= ir1Var.m6888f(j2) ? 67108864 : 33554432;
                        }
                        if ((805306368 & i) == 0) {
                            i3 |= ir1Var.m6888f(j3) ? 536870912 : 268435456;
                        }
                        int i6 = i3;
                        if ((i2 & 6) == 0) {
                            j5 = j4;
                            i4 = i2 | (ir1Var.m6888f(j5) ? 4 : 2);
                        } else {
                            j5 = j4;
                            i4 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i4 |= ir1Var.m6890g(nv2Var) ? 32 : 16;
                        }
                        if (ir1Var.m6871T(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
                            if (nv2Var == null) {
                                ir1Var.m6885d0(1801881012);
                                Object objM6869O = ir1Var.m6869O();
                                if (objM6869O == ki0.f23136a) {
                                    objM6869O = sj3.m10810f();
                                    ir1Var.m6905n0(objM6869O);
                                }
                                nv2Var2 = (nv2) objM6869O;
                                ir1Var.m6912r(false);
                            } else {
                                ir1Var.m6885d0(196671875);
                                ir1Var.m6912r(false);
                                nv2Var2 = nv2Var;
                            }
                            ((kq3) ir1Var.m6898k(xp3.f34516a)).getClass();
                            C0853kz c0853kz = ig1.f21382f;
                            nt2 nt2VarMo7630d = n74.m8585m(kt2Var, c0853kz, 2).mo7630d(new m74(52.0f, 32.0f, 52.0f, 32.0f, false));
                            ga4 ga4Var = new ga4(j5);
                            g10 g10Var = new g10();
                            g10Var.f19482a = 2.0f;
                            g10Var.f19483b = ga4Var;
                            g10Var.f19484c = p44Var2;
                            VarHandle.storeStoreFence();
                            nt2 nt2VarMo7630d2 = as4.m3258q(nt2VarMo7630d.mo7630d(g10Var), j3, p44Var2).mo7630d(kt2Var);
                            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
                            int iHashCode = Long.hashCode(ir1Var.f21683T);
                            ga3 ga3VarM6902m = ir1Var.m6902m();
                            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d2);
                            bi0.f15310ap.getClass();
                            if (interfaceC0618en == null) {
                                dt0.m4682E();
                                throw null;
                            }
                            ir1Var.m6893h0();
                            boolean z3 = ir1Var.f21682S;
                            da2 da2Var = wf2.f33290T;
                            if (z3) {
                                ir1Var.m6900l(da2Var);
                            } else {
                                ir1Var.m6911q0();
                            }
                            jh0 jh0Var = ia5.f21216g;
                            C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c);
                            jh0 jh0Var2 = ia5.f21215f;
                            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            jh0 jh0Var3 = ia5.f21217h;
                            C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
                            C0006a5.m50F(ir1Var);
                            jh0 jh0Var4 = ia5.f21214e;
                            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
                            ia5 ia5Var = ia5.f21211b;
                            C0853kz c0853kz2 = ig1.f21381e;
                            o20 o20Var = new o20();
                            o20Var.f26295a = c0853kz2;
                            VarHandle.storeStoreFence();
                            ag1 ag1VarM7919a0 = lb5.m7919a0(1, ir1Var);
                            pm4 pm4Var = new pm4();
                            pm4Var.f27748a = nv2Var2;
                            pm4Var.f27749b = z;
                            pm4Var.f27750c = ag1VarM7919a0;
                            VarHandle.storeStoreFence();
                            nt2 nt2VarM3258q = as4.m3258q(n22.m8478a(o20Var.mo7630d(pm4Var), nv2Var2, xp3.m12729a(null, 220)), j, p44Var);
                            xq2 xq2VarM9704c2 = q20.m9704c(c0853kz, false);
                            int iHashCode2 = Long.hashCode(ir1Var.f21683T);
                            ga3 ga3VarM6902m2 = ir1Var.m6902m();
                            nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM3258q);
                            ir1Var.m6893h0();
                            if (ir1Var.f21682S) {
                                ir1Var.m6900l(da2Var);
                            } else {
                                ir1Var.m6911q0();
                            }
                            C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c2);
                            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m2);
                            d55.m4373r(iHashCode2, ir1Var, jh0Var3, ir1Var);
                            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A2);
                            if (mq1Var != null) {
                                ir1Var.m6885d0(317113342);
                                mq1Var2 = mq1Var;
                                as4.m3244c(zl0.f36166a.mo7523a(pb0.m9462a(j2)), mq1Var2, ir1Var, ((i6 >> 9) & 112) | 8);
                                ir1Var.m6912r(false);
                            } else {
                                mq1Var2 = mq1Var;
                                ir1Var.m6885d0(317283439);
                                ir1Var.m6912r(false);
                            }
                            ir1Var.m6912r(true);
                            ir1Var.m6912r(true);
                        } else {
                            mq1Var2 = mq1Var;
                            ir1Var.m6874W();
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            ag4 ag4Var = new ag4();
                            ag4Var.f14489a = z;
                            ag4Var.f14490b = z2;
                            ag4Var.f14491c = mq1Var2;
                            ag4Var.f14492d = p44Var;
                            ag4Var.f14493e = p44Var2;
                            ag4Var.f14494f = j;
                            ag4Var.f14495g = j2;
                            ag4Var.f14496h = j3;
                            ag4Var.f14497i = j4;
                            ag4Var.f14498j = nv2Var;
                            ag4Var.f14499k = i;
                            ag4Var.f14500l = i2;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = ag4Var;
                        }
                    }

                    /* JADX INFO: renamed from: l */
                    public static final void m9106l(pk4 pk4Var, mi0 mi0Var, int i) {
                        C0875lk c0875lkM9549k;
                        Object obj;
                        ir1 ir1Var = (ir1) mi0Var;
                        ir1Var.m6889f0(-1436003720);
                        byte b = 2;
                        int i2 = (ir1Var.m6894i(pk4Var) ? 4 : 2) | i;
                        byte b2 = 0;
                        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
                            uj2 uj2Var = pk4Var.f27696d;
                            if (uj2Var == null || !((Boolean) uj2Var.f31926o.getValue()).booleanValue() || (c0875lkM9549k = pk4Var.m9549k()) == null || c0875lkM9549k.f24092b.length() <= 0) {
                                ir1Var.m6885d0(-2111042550);
                                ir1Var.m6912r(false);
                            } else {
                                ir1Var.m6885d0(-2112351432);
                                boolean zM6890g = ir1Var.m6890g(pk4Var);
                                Object objM6869O = ir1Var.m6869O();
                                i50 i50Var = ki0.f23136a;
                                if (zM6890g || objM6869O == i50Var) {
                                    obj = objM6869O;
                                    lk4 lk4Var = new lk4();
                                    lk4Var.f24110a = pk4Var;
                                    VarHandle.storeStoreFence();
                                    ir1Var.m6905n0(lk4Var);
                                    obj = lk4Var;
                                }
                                yj4 yj4Var = (yj4) obj;
                                ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
                                vi3 vi3Var = pk4Var.f27694b;
                                long j = pk4Var.m9550l().f34342b;
                                int i3 = ql4.f28557c;
                                int i4 = (int) (j >> 32);
                                vi3Var.m11898a(i4);
                                uj2 uj2Var2 = pk4Var.f27696d;
                                jl4 jl4Var = (uj2Var2 != null ? uj2Var2.m11577d() : null).f23216a;
                                jl3 jl3VarM7177c = jl4Var.m7177c(sc6.m10675p(i4, 0, jl4Var.f22400a.f21533a.f24092b.length()));
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((ky0Var.mo3575E(2.0f) / 2.0f) + jl3VarM7177c.f22396a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(jl3VarM7177c.f22399d)));
                                boolean zM6888f = ir1Var.m6888f(jFloatToRawIntBits);
                                Object objM6869O2 = ir1Var.m6869O();
                                Object obj2 = objM6869O2;
                                if (zM6888f || objM6869O2 == i50Var) {
                                    go0 go0Var = new go0();
                                    go0Var.f19988a = jFloatToRawIntBits;
                                    VarHandle.storeStoreFence();
                                    ir1Var.m6905n0(go0Var);
                                    obj2 = go0Var;
                                }
                                c33 c33Var = (c33) obj2;
                                boolean zM6894i = ir1Var.m6894i(yj4Var) | ir1Var.m6894i(pk4Var);
                                Object objM6869O3 = ir1Var.m6869O();
                                Object obj3 = objM6869O3;
                                if (zM6894i || objM6869O3 == i50Var) {
                                    io0 io0Var = new io0(b2);
                                    io0Var.f21604b = yj4Var;
                                    io0Var.f21605c = pk4Var;
                                    VarHandle.storeStoreFence();
                                    ir1Var.m6905n0(io0Var);
                                    obj3 = io0Var;
                                }
                                nt2 nt2VarM10327a = rf4.m10327a(kt2.f23428a, yj4Var, (PointerInputEventHandler) obj3);
                                boolean zM6888f2 = ir1Var.m6888f(jFloatToRawIntBits);
                                Object objM6869O4 = ir1Var.m6869O();
                                Object obj4 = objM6869O4;
                                if (zM6888f2 || objM6869O4 == i50Var) {
                                    C0942nd c0942nd = new C0942nd(b);
                                    c0942nd.f25690b = jFloatToRawIntBits;
                                    VarHandle.storeStoreFence();
                                    ir1Var.m6905n0(c0942nd);
                                    obj4 = c0942nd;
                                }
                                AbstractC1030pd.m9494a(c33Var, f14.m5458a(nt2VarM10327a, false, (yp1) obj4), 0L, ir1Var, 0);
                                ir1Var.m6912r(false);
                            }
                        } else {
                            ir1Var.m6874W();
                        }
                        yk3 yk3VarM6916v = ir1Var.m6916v();
                        if (yk3VarM6916v != null) {
                            C1017p0 c1017p0 = new C1017p0((byte) 14);
                            c1017p0.f27254b = pk4Var;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v.f35300d = c1017p0;
                        }
                    }

                    /* JADX INFO: renamed from: m */
                    public static oh3 m9107m(wa2 wa2Var) {
                        try {
                            String strM2257a = su1.m2257a(wa2Var, "name");
                            ba2 ba2VarM12186z = wa2Var.m12186z("info");
                            wa2 wa2VarM3528l = ba2VarM12186z != null ? ba2VarM12186z.m3528l() : null;
                            oh3 oh3Var = new oh3();
                            oh3Var.f8181a = strM2257a;
                            oh3Var.f8182b = wa2VarM3528l;
                            VarHandle.storeStoreFence();
                            return oh3Var;
                        } catch (Exception e) {
                            ArrayList arrayList = i20.m6589n(e).f5884s;
                            String message = e.getMessage();
                            if (message == null) {
                                message = e.getClass().getName();
                            }
                            arrayList.add(message);
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: n */
                    public static final int m9108n(a83 a83Var) {
                        switch (a83Var.ordinal()) {
                            case 0:
                                return 1;
                            case 1:
                                return 6;
                            case 2:
                                return 2;
                            case 3:
                                return 8;
                            case 4:
                                return 3;
                            case 5:
                                return 7;
                            case 6:
                                return 4;
                            case 7:
                                return 5;
                            case 8:
                                return 10;
                            case 9:
                                return 9;
                            default:
                                C0670g.m5864c();
                                return 0;
                        }
                    }

                    /* JADX INFO: renamed from: o */
                    public static final w91 m9109o(String str, Enum[] enumArr) {
                        w91 w91Var = new w91();
                        w91Var.f33168a = enumArr;
                        C0675g4 c0675g4 = new C0675g4((byte) 25);
                        c0675g4.f19600b = w91Var;
                        c0675g4.f19601c = str;
                        VarHandle.storeStoreFence();
                        w91Var.f33169b = new dg4(c0675g4);
                        VarHandle.storeStoreFence();
                        return w91Var;
                    }

                    /* JADX INFO: renamed from: p */
                    public static final long m9110p() {
                        return Thread.currentThread().getId();
                    }

                    /* JADX INFO: renamed from: q */
                    public static void m9111q(ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id, LongSparseArray longSparseArray) {
                        TranslationResponseValue value;
                        CharSequence text;
                        k14 k14Var;
                        i14 i14Var;
                        yp1 yp1Var;
                        int size = longSparseArray.size();
                        for (int i = 0; i < size; i++) {
                            long jKeyAt = longSparseArray.keyAt(i);
                            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
                            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (k14Var = (k14) viewOnAttachStateChangeListenerC0758id.m6755d().m8197b((int) jKeyAt)) != null && (i14Var = k14Var.f22816a) != null) {
                                Object objM8132g = i14Var.f21012d.f17631a.m8132g(d14.f16715l);
                                if (objM8132g == null) {
                                    objM8132g = null;
                                }
                                C1353y2 c1353y2 = (C1353y2) objM8132g;
                                if (c1353y2 != null && (yp1Var = (yp1) c1353y2.f34818b) != null) {
                                }
                            }
                        }
                    }

                    /* JADX INFO: renamed from: r */
                    public static final void m9112r(uj2 uj2Var) {
                        el4 el4Var = uj2Var.f31916e;
                        if (el4Var != null) {
                            uj2Var.f31933v.invoke(xk4.m12702a((xk4) uj2Var.f31915d.f25810b, null, 0L, 3));
                            bl4 bl4Var = el4Var.f18239a;
                            if (bl4Var.f15405b.compareAndSet(el4Var, null)) {
                                bl4Var.f15404a.mo4551g();
                            }
                        }
                        uj2Var.f31916e = null;
                    }

                    /* JADX INFO: renamed from: s */
                    public static final void m9113s(long j, byte[] bArr, int i, int i2, int i3) {
                        int i4 = 7 - i2;
                        int i5 = 8 - i3;
                        if (i5 > i4) {
                            return;
                        }
                        while (true) {
                            int i6 = kw1.f23556a[(int) ((j >> (i4 << 3)) & 255)];
                            int i7 = i + 1;
                            bArr[i] = (byte) (i6 >> 8);
                            i += 2;
                            bArr[i7] = (byte) i6;
                            if (i4 == i5) {
                                return;
                            } else {
                                i4--;
                            }
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX INFO: renamed from: t */
                    public static final Class m9114t(r90 r90Var) {
                        Class cls = r90Var.f29101a;
                        if (cls.isPrimitive()) {
                            String name = cls.getName();
                            switch (name.hashCode()) {
                                case -1325958191:
                                    if (name.equals("double")) {
                                        return Double.class;
                                    }
                                    break;
                                case 104431:
                                    if (name.equals("int")) {
                                        return Integer.class;
                                    }
                                    break;
                                case 3039496:
                                    if (name.equals("byte")) {
                                        return Byte.class;
                                    }
                                    break;
                                case 3052374:
                                    if (name.equals("char")) {
                                        return Character.class;
                                    }
                                    break;
                                case 3327612:
                                    if (name.equals("long")) {
                                        return Long.class;
                                    }
                                    break;
                                case 3625364:
                                    if (name.equals("void")) {
                                        return Void.class;
                                    }
                                    break;
                                case 64711720:
                                    if (name.equals("boolean")) {
                                        return Boolean.class;
                                    }
                                    break;
                                case 97526364:
                                    if (name.equals("float")) {
                                        return Float.class;
                                    }
                                    break;
                                case 109413500:
                                    if (name.equals("short")) {
                                        return Short.class;
                                    }
                                    break;
                            }
                        }
                        return cls;
                    }

                    /* JADX INFO: renamed from: u */
                    public static final g12 m9115u() {
                        g12 g12Var = f26725S;
                        if (g12Var != null) {
                            return g12Var;
                        }
                        f12 f12Var = new f12("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = uw4.f32218a;
                        ga4 ga4Var = new ga4(pb0.f27495b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new w83(8.0f, 5.0f));
                        arrayList.add(new i93(14.0f));
                        arrayList.add(new d93(11.0f, -7.0f));
                        arrayList.add(s83.f29968c);
                        f12.m5445c(f12Var, arrayList, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                        g12 g12VarM5449e = f12Var.m5449e();
                        f26725S = g12VarM5449e;
                        return g12VarM5449e;
                    }

                    /* JADX INFO: renamed from: v */
                    public static final g12 m9116v() {
                        g12 g12Var = f26726T;
                        if (g12Var != null) {
                            return g12Var;
                        }
                        f12 f12Var = new f12("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = uw4.f32218a;
                        ga4 ga4Var = new ga4(pb0.f27495b);
                        tv1 tv1Var = new tv1((byte) 1);
                        tv1Var.m11175k(19.14f, 12.94f);
                        tv1Var.m11170f(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                        tv1Var.m11170f(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                        tv1Var.m11174j(2.03f, -1.58f);
                        tv1Var.m11170f(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                        tv1Var.m11174j(-1.92f, -3.32f);
                        tv1Var.m11170f(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                        tv1Var.m11174j(-2.39f, 0.96f);
                        tv1Var.m11170f(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                        tv1Var.m11173i(14.4f, 2.81f);
                        tv1Var.m11170f(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                        tv1Var.m11172h(-3.84f);
                        tv1Var.m11170f(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                        tv1Var.m11173i(9.25f, 5.35f);
                        tv1Var.m11169e(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                        tv1Var.m11173i(5.24f, 5.33f);
                        tv1Var.m11170f(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                        tv1Var.m11173i(2.74f, 8.87f);
                        tv1Var.m11169e(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                        tv1Var.m11174j(2.03f, 1.58f);
                        tv1Var.m11169e(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                        tv1Var.m11177m(0.02f, 0.64f, 0.07f, 0.94f);
                        tv1Var.m11174j(-2.03f, 1.58f);
                        tv1Var.m11170f(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                        tv1Var.m11174j(1.92f, 3.32f);
                        tv1Var.m11170f(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                        tv1Var.m11174j(2.39f, -0.96f);
                        tv1Var.m11170f(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                        tv1Var.m11174j(0.36f, 2.54f);
                        tv1Var.m11170f(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                        tv1Var.m11172h(3.84f);
                        tv1Var.m11170f(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                        tv1Var.m11174j(0.36f, -2.54f);
                        tv1Var.m11170f(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                        tv1Var.m11174j(2.39f, 0.96f);
                        tv1Var.m11170f(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                        tv1Var.m11174j(1.92f, -3.32f);
                        tv1Var.m11170f(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                        tv1Var.m11173i(19.14f, 12.94f);
                        tv1Var.m11168d();
                        tv1Var.m11175k(12.0f, 15.6f);
                        tv1Var.m11170f(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                        tv1Var.m11177m(1.62f, -3.6f, 3.6f, -3.6f);
                        tv1Var.m11177m(3.6f, 1.62f, 3.6f, 3.6f);
                        tv1Var.m11176l(13.98f, 15.6f, 12.0f, 15.6f);
                        tv1Var.m11168d();
                        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                        g12 g12VarM5449e = f12Var.m5449e();
                        f26726T = g12VarM5449e;
                        return g12VarM5449e;
                    }

                    /* JADX INFO: renamed from: w */
                    public static boolean m9117w(String str) {
                        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
                    }

                    /* JADX INFO: renamed from: x */
                    public static final mt2 m9118x(px0 px0Var, int i) {
                        mt2 mt2Var = ((mt2) px0Var).f25195a.f25200f;
                        if (mt2Var == null || (mt2Var.f25198d & i) == 0) {
                            return null;
                        }
                        while (mt2Var != null) {
                            int i2 = mt2Var.f25197c;
                            if ((i2 & 2) != 0) {
                                return null;
                            }
                            if ((i2 & i) != 0) {
                                return mt2Var;
                            }
                            mt2Var = mt2Var.f25200f;
                        }
                        return null;
                    }

                    /* JADX INFO: renamed from: y */
                    public static final void m9119y(uj2 uj2Var, xk4 xk4Var, vi3 vi3Var) {
                        e94 e94VarM5353c0 = ev0.m5353c0();
                        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                        try {
                            kl4 kl4VarM11577d = uj2Var.m11577d();
                            if (kl4VarM11577d == null) {
                                return;
                            }
                            el4 el4Var = uj2Var.f31916e;
                            if (el4Var == null) {
                                return;
                            }
                            cf2 cf2VarM11576c = uj2Var.m11576c();
                            if (cf2VarM11576c == null) {
                                return;
                            }
                            C0006a5.m49D(xk4Var, uj2Var.f31912a, kl4VarM11577d.f23216a, cf2VarM11576c, el4Var, uj2Var.m11575b(), vi3Var);
                        } finally {
                            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        }
                    }

                    /* JADX INFO: renamed from: z */
                    public static final nt2 m9120z(nt2 nt2Var, yp1 yp1Var) {
                        z33 z33Var = new z33();
                        z33Var.f35740a = yp1Var;
                        VarHandle.storeStoreFence();
                        return nt2Var.mo7630d(z33Var);
                    }
                }
