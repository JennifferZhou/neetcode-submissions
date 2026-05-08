class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s: strs) {
            res.append(s.length() + ",");
            System.out.println(res);

        }
        res.append("#");
        for (int i = 0; i < strs.size(); i++) {
            res.append(strs.get(i));
        }
        System.out.println(res);
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int num_index = 0;
        while (str.charAt(num_index) != '#') {
            StringBuilder length = new StringBuilder();
            while (str.charAt(num_index) != ',' ){
                length.append(str.charAt(num_index));
                num_index++;
            }
            sizes.add(Integer.parseInt(length.toString()));
            num_index++;
        }
        num_index++;
        for (Integer size : sizes){
            res.add(str.substring(num_index, num_index + size));
            num_index += size;
        }
        return res;
    }
}
