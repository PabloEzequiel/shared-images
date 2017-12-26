# Install tmux on CentOS
#   Based on:
#   https://gist.github.com/Root-shady/d48d5282651634f464af

# (1). tmux has a library dependency on libevent which, of course, isn’t installed by default. 
wget https://github.com/downloads/libevent/libevent/libevent-2.0.21-stable.tar.gz
tar xzvf libevent-2.0.21-stable.tar.gz
cd libevent-2.0.21-stable
./configure && make
sudo make install


# (2). To get and build the latest from version control:
git clone https://github.com/tmux/tmux.git
cd tmux
sh autogen.sh
./configure && make

#3